function move(block, action) {
  if (isLand(block)) {
    return;
  }
  let currentMove = parseInt(block.style[action.direction]) || 0;
  block.style[action.direction] = currentMove + action.step + 'px';
}

function land(block) {
  if (isLand(block)) {
    return;
  }
  let action = window.KEY_SPACE;
  block.style[action.direction] = getBoundaryHeight() + 'px';
}

function getBoundaryHeight() {
  let main = getElement('.main');
  let mainHeight = calculateTotalHeight(main);
  let landBlockTotalHeight = calculateBlockHeights(main.children);
  return mainHeight - landBlockTotalHeight;
}

function isLand(block) {
  let boundaryHeight = getBoundaryHeight();
  let blockHeight = calculateTotalHeight(block);
  return blockHeight >= boundaryHeight;
}

function release(block) {
  block.blur();
  block.className = 'land-block';
  block.tabIndex = -1;
}

function afterLand(block) {
  release(block);
  let nextBlock = createDivOnFocus('block');
  block.parentNode.prepend(nextBlock);
  initBlockEvents();
}

function initBlockEvents() {
  let block = getElement('.block');
  block.focus();
  block.addEventListener("keydown", (event) => {
    if (event.key === window.KEY_DOWN.key) {
      move(block, window.KEY_DOWN);
      if (isLand(block)) {
        afterLand(block);
      }
    }
    if (event.key === window.KEY_SPACE.key) {
      land(block);
      afterLand(block);
    }
  });
  setScheduler(
    () => move(block, window.KEY_DOWN),
    () => isLand(block),
    1000
  );
}

document.addEventListener("DOMContentLoaded", () => {
  initBlockEvents();
});
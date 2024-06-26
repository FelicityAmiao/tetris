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
  let boundaryHeight = getBoundaryHeight();
  let oneBlockHeight = calculateBlockHeights([getElement('.block')]);
  block.style[action.direction] = boundaryHeight - oneBlockHeight + 'px';
}

function getBoundaryHeight() {
  let mainHeight = calculateTotalHeight(getElement('.main'));
  let landBlockTotalHeight = calculateBlockHeights(document.querySelectorAll('.land-block'));
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
  if (getElement('.block') !== null) {
    return;
  }
  let nextBlock = createDivOnFocus('block');
  block.parentNode.prepend(nextBlock);
  initBlockEvents();
}

function drop(block, moveCallBack) {
  moveCallBack();
  if (isLand(block)) {
    afterLand(block);
  }
}

function initBlockEvents() {
  let block = getElement('.block');
  block.focus();
  block.addEventListener("keydown", (event) => {
    if (event.key === window.KEY_DOWN.key) {
      drop(block, () => move(block, window.KEY_DOWN));
    }
    if (event.key === window.KEY_SPACE.key) {
      drop(block, () => land(block));
    }
  });
  setScheduler(
    ()  => drop(block, () => move(block, window.KEY_DOWN)),
    () => isLand(block),
    500
  );
}

document.addEventListener("DOMContentLoaded", () => {
  initBlockEvents();
});
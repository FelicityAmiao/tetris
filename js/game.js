function move(block, action) {
  let currentLocation = parseInt(block.style[action.direction]) || 0;
  block.style[action.direction] = currentLocation + action.step + 'px';
}

function isLand(block) {
  let main = getElement('.main');
  let mainHeight = calculateTotalHeight(main);
  let blockHeight = calculateTotalHeight(block);
  return blockHeight >= mainHeight;
}

document.addEventListener("DOMContentLoaded", () => {
  let block = getElement('.block');
  block.focus();
  block.addEventListener("keydown", (event) => {
    if (event.key === window.KEY_DOWN.key) {
      move(block, window.KEY_DOWN);
      if (isLand(block)) {
        block.blur();
      }
    }
  });
  setScheduler(
    () => move(block, window.KEY_DOWN),
    () => isLand(block),
    1000
  );
});
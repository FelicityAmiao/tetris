function calculateTotalHeight(element) {
  let style = window.getComputedStyle(element);
  let marginTop = parseInt(style.marginTop, 10);
  let marginBottom = parseInt(style.marginBottom, 10);
  return element.offsetHeight + marginTop + marginBottom;
}

function moveDown(block, action) {
  let currentLocation = parseInt(block.style[action.direction]) || 0;
  block.style[action.direction] = currentLocation + action.step + 'px';
}

function isLand(block, main) {
  let blockHeight = calculateTotalHeight(block);
  let mainHeight = calculateTotalHeight(main);
  return blockHeight >= mainHeight;
}

function getElement(selector) {
  return document.querySelector(selector);
}

document.addEventListener("DOMContentLoaded", () => {
  let block = getElement('.block');
  block.focus();
  block.addEventListener("keydown", (event) => {
    if (event.key === window.KEY_DOWN.key) {
      moveDown(block, window.KEY_DOWN);
      if (isLand(block, getElement('.main'))) {
        block.blur();
      }
    }
  });
});
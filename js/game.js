document.addEventListener("DOMContentLoaded", () => {
  let block = document.querySelector('.block');
  block.focus();
  block.addEventListener("keydown", (event) => {
    if (event.key === window.KEY_DOWN.key) {
      let currentMarginTop = parseInt(block.style[window.KEY_DOWN.direction]) || 0;
      block.style[window.KEY_DOWN.direction] = currentMarginTop + window.STEP + 'px';
    }
  });
});
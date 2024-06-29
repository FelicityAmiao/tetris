function getColNumber(block) {
  let blockOffsetLeft = block.offsetLeft;
  let blockWidth = block.offsetWidth;
  return blockOffsetLeft / blockWidth;
}

function getMainCols() {
  let mainWidth = parseInt(getCssVariable('--main-width'));
  let blockWidth = parseInt(getCssVariable('--block-width'));
  return mainWidth / blockWidth;
}
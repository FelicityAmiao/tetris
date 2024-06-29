function getColNumber(block) {
  let blockOffsetLeft = block.offsetLeft;
  let blockWidth = block.offsetWidth;
  return blockOffsetLeft / blockWidth;
}

function getRowNumber(block) {
  return currentBottomLandBlocks(block).length;
}

function currentBottomLandBlocks(block) {
  return getElements('[class^="land-block-Col' + getColNumber(block) + '"]');
}

function getMainCols() {
  let mainWidth = parseInt(getCssVariable('--main-width'));
  let blockWidth = parseInt(getCssVariable('--block-width'));
  return mainWidth / blockWidth;
}
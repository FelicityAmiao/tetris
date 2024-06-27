function isLand(block) {
  let boundaryHeight = getBoundaryHeight();
  let blockHeight = calculateTotalHeight(block);
  return blockHeight >= boundaryHeight;
}

function isLeftWall(block) {
  return block.offsetLeft <= 0;
}

function isRightWall(block) {
  return block.offsetLeft + block.offsetWidth >= block.offsetParent.offsetWidth;
}

function getBoundaryHeight() {
  let mainHeight = calculateTotalHeight(getElement('.main'));
  let landBlockTotalHeight = calculateElementHeights(document.querySelectorAll('[class^="land-block"]'));
  return mainHeight - landBlockTotalHeight;
}

function getColBoundaryHeight() {
  let mainHeight = calculateTotalHeight(getElement('.main'));
  let colLandBlockTotalHeight = calculateElementHeights(document.querySelectorAll('.land-block-Col1'));
  return mainHeight - colLandBlockTotalHeight;
}
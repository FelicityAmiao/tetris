function isLand(block) {
  let boundaryHeight = getColBoundaryHeight(block);
  let blockHeight = calculateTotalHeight(block);
  return blockHeight >= boundaryHeight;
}

function isLeftWall(block) {
  return block.offsetLeft <= 0;
}

function isRightWall(block) {
  return block.offsetLeft + block.offsetWidth >= block.offsetParent.offsetWidth;
}

function getColBoundaryHeight(block) {
  let mainHeight = calculateTotalHeight(getElement('.main'));
  let colLandBlockTotalHeight = calculateElementHeights(document.querySelectorAll('.land-block-Col' + getColNumber(block)));
  return mainHeight - colLandBlockTotalHeight;
}
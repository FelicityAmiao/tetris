function isLand(block) {
  let boundaryHeight = getBoundaryHeight();
  let blockHeight = calculateTotalHeight(block);
  return blockHeight >= boundaryHeight;
}

function isWall(block) {
  return block.offsetLeft <= 0 || block.offsetLeft + block.offsetWidth >= block.offsetParent.offsetWidth;
}

function getBoundaryHeight() {
  let mainHeight = calculateTotalHeight(getElement('.main'));
  let landBlockTotalHeight = calculateElementHeights(document.querySelectorAll('.land-block'));
  return mainHeight - landBlockTotalHeight;
}
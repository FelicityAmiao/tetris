function getColNumber(block) {
  let blockOffsetLeft = block.offsetLeft;
  let blockWidth = block.offsetWidth;
  return blockOffsetLeft / blockWidth;
}
function release(block) {
  block.blur();
  block.className = 'land-block-Col' + getColNumber(block) + '-Row' + getRowNumber(block);
  block.tabIndex = -1;
}

function createNextBlock(parentNode) {
  let nextBlock = createDivOnFocus('block');
  parentNode.prepend(nextBlock);
  initBlockEvents();
}

function removeFullLine(landBlocks) {
  for (let landBlock of landBlocks) {
    landBlock.remove();
  }
}

function processIfCurrentLineFull(block) {
  let landBlockInLine = getElements('[class*="-Row' + (getRowNumber(block) - 1) + '"]');
  if (landBlockInLine.length === window.mainCols) {
    removeFullLine(landBlockInLine);
  }
}

function afterLand(block) {
  release(block);
  if (getElement('.block') !== null) {
    return;
  }
  createNextBlock(block.parentNode);
  processIfCurrentLineFull(block);
}

function initBlockEvents() {
  let block = getElement('.block');
  block.focus();
  addPlayerEvents(block);
  // setScheduler(
  //   ()  => drop(block, () => move(block, window.KEY_DOWN)),
  //   () => isLand(block),
  //   500
  // );
}

function processLand(block, moveCallBack) {
  moveCallBack();
  if (isLand(block)) {
    afterLand(block);
  }
}
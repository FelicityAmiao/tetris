function release(block) {
  block.blur();
  block.className = 'land-block-Col' + getColNumber(block);
  block.tabIndex = -1;
}

function createNextBlock(parentNode) {
  let nextBlock = createDivOnFocus('block');
  parentNode.prepend(nextBlock);
  initBlockEvents();
}

function removeFullLine(landBlocks) {
  console.log('Full line');
}

function processIfFullLine() {
  let landBlocks = document.querySelectorAll('[class^="land-block"]');
  if (landBlocks.length === mainCols) {
    removeFullLine(landBlocks);
  }
}

function processCurrentBlock(block) {
  release(block);
  processIfFullLine();
}

function afterLand(block) {
  processCurrentBlock(block);
  if (getElement('.block') !== null) {
    return;
  }
  createNextBlock(block.parentNode);
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
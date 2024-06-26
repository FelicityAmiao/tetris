function getElement(selector) {
  return document.querySelector(selector);
}

function createDivOnFocus(className) {
  let div = document.createElement('div');
  div.className = className;
  div.tabIndex = 1;
  return div;
}

function calculateTotalHeight(element) {
  let style = window.getComputedStyle(element);
  let marginTop = parseInt(style.marginTop, 10);
  let marginBottom = parseInt(style.marginBottom, 10);
  return element.offsetHeight + marginTop + marginBottom;
}

function calculateBlockHeights(elements) {
  let totals = 0;
  for (let element of elements) {
    totals += element.offsetHeight;
  }
  return totals;
}
function getElement(selector) {
  return document.querySelector(selector);
}

function getElements(selector) {
  return document.querySelectorAll(selector);
}

function calculateTotalHeight(element) {
  let style = window.getComputedStyle(element);
  let marginTop = parseInt(style.marginTop, 10);
  let marginBottom = parseInt(style.marginBottom, 10);
  return element.offsetHeight + marginTop + marginBottom;
}

function calculateElementHeights(elements) {
  let totals = 0;
  for (let element of elements) {
    totals += element.offsetHeight;
  }
  return totals;
}

function createDivOnFocus(className) {
  let div = document.createElement('div');
  div.className = className;
  div.tabIndex = 1;
  return div;
}

function getCssVariable(propertyName) {
  let rootStyle = getComputedStyle(document.documentElement);
  return rootStyle.getPropertyValue(propertyName).trim();
}
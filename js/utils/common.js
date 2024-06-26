function getElement(selector) {
  return document.querySelector(selector);
}

function calculateTotalHeight(element) {
  let style = window.getComputedStyle(element);
  let marginTop = parseInt(style.marginTop, 10);
  let marginBottom = parseInt(style.marginBottom, 10);
  return element.offsetHeight + marginTop + marginBottom;
}
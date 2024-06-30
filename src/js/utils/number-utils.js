function getNumbers(string) {
  return string.match(/\d+/g).map(Number);
}
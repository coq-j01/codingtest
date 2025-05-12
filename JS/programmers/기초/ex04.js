// 대소문자 바꿔서 출력하기
const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});
function toUpper(char) {
  let str2 = "";
  for (let i = 0; i < char.length; i++) {
    if (char[i] >= "A" && char[i] <= "Z") {
      str2 += char[i].toLowerCase();
    } else str2 += char[i].toUpperCase();
  }
  console.log(str2);
}
let input = [];

rl.on("line", function (line) {
  input = [line];
  rl.close();
}).on("close", function () {
  str = input[0];
  toUpper(str);
});

// 문자열 출력하기
const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];

rl.on("line", function (line) {
  input = [line];
  rl.close();
}).on("close", function () {
  str = input[0];
  output = str;
  console.log(output);
  process.exit();
});

// 문자열 붙여서 출력하기
const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];

rl.on("line", function (line) {
  input = line.split(" ");
  rl.close();
}).on("close", function () {
  str1 = input[0];
  str2 = input[1];
  let str = str1.concat(str2);
  console.log(str);
  // console.log(strArr.join('')) -> join함수 사용
});

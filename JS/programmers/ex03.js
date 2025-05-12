// 문자열 반복하여 출력하기
const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

// function repeat(str, n) {
//   let repeatstr = [];
//   for (let i = 0; i < n; i++) {
//     repeatstr.push(str);
//   }
//   console.log(repeatstr);
// }

function repeat(str, n) {
  for (let i = 0; i < n; i++) {
    process.stdout.write(str);
  }
}

let input = [];

rl.on("line", function (line) {
  input = line.split(" ");
  rl.close();
}).on("close", function () {
  str = input[0];
  n = Number(input[1]);
  repeat(str, n);
  // process.stdout.write(str.repeat(n));
});

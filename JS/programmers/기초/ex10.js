// 문자열 겹쳐쓰기
function solution(my_string, overwrite_string, s) {
  var answer = "";
  answer = answer.concat(my_string.substr(0, s));
  answer = answer.concat(overwrite_string.substr());
  answer = answer.concat(my_string.substr(overwrite_string.length + s));
  // return answer;
  return (
    my_string.substr(0, s) +
    overwrite_string.substr() +
    my_string.substr(overwrite_string.length + s)
  );
}
console.log(solution("He11oWor1d", "lloWorl", 2));

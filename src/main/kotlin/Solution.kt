//JadenCase 문자열 : 모든 단어의 첫문자가 대문자 그외는 소문자

class Solution {
    fun solution(s: String): String {
        //공백이 연속으로 나올때를 고려하지 않음;
        //공백이 여러개이면 마찬가지로 출력값도 여러개이어야한다.
        var answer = ""

        var result = StringBuilder() //효율적인 문자열 관리

        var strList = s.split(" ").toMutableList()


        for(i in strList.indices){
            if(strList[i]==""){
                result = result.append(" ")
            }
            else {
                strList[i] = strList[i].first().uppercase() + strList[i].substring(1..strList[i].lastIndex).lowercase()
                result = result.append("${strList[i]} ")
            }
        }
        result.deleteCharAt(result.length-1) //맨 뒷부분 공백 제거
        answer = result.toString()
        return answer
    }
}
fun main(){
    var a = Solution()
    a.solution("  for the what 1what  ")//문자 마지막일때 예외처리를해야하네...
    a.solution("for the last week")
}
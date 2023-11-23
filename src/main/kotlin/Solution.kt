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
                continue
            }
            strList[i] = strList[i].first().uppercase() + strList[i].substring(1..strList[i].lastIndex).lowercase()
            if(i == strList.indices.last) {
                result = result.append("${strList[i]}")
                break
            }
            result = result.append("${strList[i]} ")
        }
        answer = result.toString()//맨 뒷부분 공백 제거
        return answer
    }
}
fun main(){
    var a = Solution()
    a.solution("  for the what 1what  ")
    a.solution("for the last week")
}
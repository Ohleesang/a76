//JadenCase 문자열 : 모든 단어의 첫문자가 대문자 그외는 소문자

class Solution {
    fun solution(s: String): String {
        var answer = ""
        var strList = s.split(" ").toMutableList()
        for(i in strList.indices){
            strList[i] = strList[i].first().uppercase() + strList[i].substring(1..strList[i].lastIndex).lowercase()
            answer = answer + strList[i]+" "
        }
        answer = answer.trimEnd()//맨 뒷부분 공백 제거
        return answer
    }
}
fun main(){
    var a = Solution()
    a.solution("3people unFollowed me")
    a.solution("for the last week")
}
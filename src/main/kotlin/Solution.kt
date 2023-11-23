//JadenCase 문자열 : 모든 단어의 첫문자가 대문자 그외는 소문자

class Solution {
    fun solution(s: String): String {
<<<<<<< HEAD
        var answer = ""
        var strList = s.split(" ").toMutableList()
        for(i in strList.indices){
            strList[i] = strList[i].first().uppercase() + strList[i].substring(1..strList[i].lastIndex).lowercase()
            answer = answer + strList[i]+" "
        }
        answer = answer.trimEnd()//맨 뒷부분 공백 제거
=======
        //공백이 연속으로 나올때를 고려하지 않음;
        var answer = ""
        var result = StringBuilder()
        var strList = s.split(" ").toMutableList()
        while(strList.remove("")){}
        for(i in strList.indices){
            strList[i] = strList[i].first().uppercase() + strList[i].substring(1..strList[i].lastIndex).lowercase()
            result = result.append("${strList[i]} ")
        }
        answer = result.toString().trimEnd()//맨 뒷부분 공백 제거
>>>>>>> fdedbe9 (런타임 에러 오류(더 효율적으로 짜야하나보다..))
        return answer
    }
}
fun main(){
    var a = Solution()
<<<<<<< HEAD
    a.solution("3people unFollowed me")
=======
    a.solution("3people  unFollowed  me")
>>>>>>> fdedbe9 (런타임 에러 오류(더 효율적으로 짜야하나보다..))
    a.solution("for the last week")
}
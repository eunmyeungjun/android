// 여러 이메일이 담긴 리스트가 있어요!
// 저는 구글로 가입한 사람과 네이버로 가입한 사람의 숫자와
// 그 외의 기메일로 가입한 사람의 숫자를 보고 싶습니다.
// @와 .을 기준으로 어느 사이트에서 들어온 사람들인지 구분을 합니다.
// 아래와 같은 함수를 만들어보세요.

fun main(){

    val emailList1 = arrayListOf<String>(
        "jay@naver.com",
        "john@naver.com",
        "emily@google.com",
        "ken@google.com",
        "minjun@kakao.com")
    val result1 = solution(emailList1)
    println(result1)

    val emailList2 = arrayListOf<String>("Aiden@naver.com",
        "Andew@naver.com",
        "Adrian@daum.com",
        "Asher@google.com",
        "Austin@kakao.com",
        "Antonio@google.com")
    val result2 = solution(emailList2)
    println(result2)
println (result)

}

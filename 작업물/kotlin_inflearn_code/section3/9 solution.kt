// 리스트의 가장 작은 숫자를 찾아서 제거하고
// 남은 숫자들을 모두 더해서 값을 출력해주는 함수를 만드세요

fun main(){

    val input1 = arrayListOf(1,2,3,4,5)
    val result1 = solution(input1)
    println(result1)
    // 14

    val input2 = arrayListOf(10,8,6,4,2)
    val result2 = solution(input2)
    println(result2)
    // 28

    val input3 = arrayListOf(6, 3, 9)
    val result3 = solution(input3)
    println(result3)
    // 15

}


fun solution(list: ArrayList<Int>) : Int {

    /*
    val min = list.minOrNull()
    println(min)

    list.remove(min)

    println(list)

    var result = 0

    for (i in list) {
        result += i
    }
    */

    var smallest = list[0]

    for (i in 1..list.size-1){
        // println(list[i])
        if(smallest > list[i]){
            smallest = list[i]
        }
    }

    list.remove(smallest)

    var result = 0

    for (i in list) {
        result += i
    }

    return result
}

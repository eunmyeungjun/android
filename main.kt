package com.example.myhotel

fun main(){
    val today = 20231130

    println("호텔 예약 프로그램입니다.\n[메뉴]\n1. 방 예약 2. 예약 목록 출력 3. 예약목록(정렬) 출력 " +
            "4. 시스템 종료 5. 금액 입금 - 출금 내역 목록 출력 6. 예약 변경/취소")
    val menuNum = readLine()!!.toInt()

    when(menuNum){
        1 ->{
            println("예약자분의 성함을 입력해 주세요")
            val reserveName = readLine()!!
            println("예약할 방 번호를 입력해 주세요.")
            var roomNum = readLine()!!.toInt()
            while (true){
                if (roomNum in 100..999){
                    break
                }
                else {
                    println("올바르지 않은 방 번호입니다. 방 번호는 100~999 영역 이내입니다."
                    +"\n다시 입력해 주세요")
                    roomNum = readLine()!!.toInt()
                }
            }
            println("체크인 한 날짜를 입력해주세요. 표기방식 : $today")
            var checkInDate = readLine()!!.toInt()
            while (true){
                if (today <= checkInDate){
                   break
                }
                else{
                    println("체크인은 지난날은 선택할 수 없습니다. 다시 입력해 주세요. 오늘날짜 : $today")
                    checkInDate = readLine()!!.toInt()
                }
            }
            println("체크아웃 날짜를 입력해 주세요. 체크인 날짜 : $checkInDate")
            var checkOutDate = readLine()!!.toInt()
            while (true){
                if (checkOutDate > checkInDate){
                    break
                }
                else{
                    println("체크인 날짜보다 이전이거나 같을 수는 없습니다. 다시 입력해주세요." +
                            " 체크인 날짜 : $checkInDate")
                    checkOutDate = readLine()!!.toInt()
                }
            }
            println("호텔 예약이 완료되었습니다.")
            return
        }
        4 -> {
            println("호텔 예약 프로그램을 종료합니다.")
            return
        }


    }








}
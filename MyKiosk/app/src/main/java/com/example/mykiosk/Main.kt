package com.example.mykiosk

fun main(){
    val menuList = MainMenu()
    val bugerMenu = Burger("",0.0)
    var orderList = ArrayList<Food>()

    while (true) {
            menuList.showMenu()

        var menuNum : Int
        while(true) {
            try {
                 menuNum = readLine()!!.toInt()
                if (menuNum > 5){
                    menuList.overMenu()
                } else break

            } catch (e:NumberFormatException){
                menuList.notInt()
            }
        }
        when(menuNum) { 
            0 -> {
                println("프로그램을 종료합니다.")
                break
            }

            1 -> {
                bugerMenu.BurgerMenu()
                var burgerNum : Int
                while(true) {
                    try {
                        burgerNum = readLine()!!.toInt()
                        if (burgerNum > 5){
                            bugerMenu.burgerNumOver()
                        } else break
                    } catch (e:NumberFormatException){
                        bugerMenu.burgerNumNotInt()
                    }
                }
                when(burgerNum) {
                    0 -> menuNum = 1

                    1 -> {
                        ShackBurger().showInfo()
                        println("위 메뉴를 장바구니에 추가하시겠습니까?\n"+
                        "1. 확인        2. 취소")
                        var yesOrNo : Int
                        while (true){
                            try{
                                yesOrNo = readLine()!!.toInt()
                                if (yesOrNo == 1 || yesOrNo == 2){
                                    break
                                } else{
                                    println("올바른 숫자를 입력해 주세요")
                                }
                            }catch (e:NumberFormatException){
                                println("올바른 숫자를 입력해 주세요")
                                println("위 메뉴를 장바구니에 추가하시겠습니까?\n"+
                                        "1. 확인        2. 취소")
                            }
                        }
                        when(yesOrNo){
                            1 -> {
                                println("${ShackBurger().name} 가 장바구니에 추가되었습니다.\n")
                                orderList.add(ShackBurger())
                            }
                            2 ->{
                                println("주문을 취소하였습니다.")
                                menuNum = 1
                            }
                        }

                    }
                    2 -> {
                        SmokeShack().showInfo()
                        println("위 메뉴를 장바구니에 추가하시겠습니까?\n"+
                                "1. 확인        2. 취소")
                        var yesOrNo : Int
                        while (true){
                            try{
                                yesOrNo = readLine()!!.toInt()
                                if (yesOrNo == 1 || yesOrNo == 2){
                                    break
                                } else{
                                    println("올바른 숫자를 입력해 주세요")
                                }
                            }catch (e:NumberFormatException){
                                println("올바른 숫자를 입력해 주세요")
                                println("위 메뉴를 장바구니에 추가하시겠습니까?\n"+
                                        "1. 확인        2. 취소")
                            }
                        }
                        when(yesOrNo){
                            1 -> {
                                println("${SmokeShack().name} 가 장바구니에 추가되었습니다.\n")
                                orderList.add(SmokeShack())
                            }
                            2 ->{
                                println("주문을 취소하였습니다.")
                                menuNum = 1
                            }
                        }
                    }

                    3 -> {
                        ShroomBurger().showInfo()
                        println("위 메뉴를 장바구니에 추가하시겠습니까?\n"+
                                "1. 확인        2. 취소")
                        var yesOrNo : Int
                        while (true){
                            try{
                                yesOrNo = readLine()!!.toInt()
                                if (yesOrNo == 1 || yesOrNo == 2){
                                    break
                                } else{
                                    println("올바른 숫자를 입력해 주세요")
                                }
                            }catch (e:NumberFormatException){
                                println("올바른 숫자를 입력해 주세요")
                                println("위 메뉴를 장바구니에 추가하시겠습니까?\n"+
                                        "1. 확인        2. 취소")
                            }
                        }
                        when(yesOrNo){
                            1 -> {
                                println("${ShroomBurger().name} 가 장바구니에 추가되었습니다.\n")
                                orderList.add(ShroomBurger())
                            }
                            2 ->{
                                println("주문을 취소하였습니다.")
                                menuNum = 1
                            }
                        }
                    }
                    4 -> {
                        Hamburger().showInfo()
                        println("위 메뉴를 장바구니에 추가하시겠습니까?\n"+
                                "1. 확인        2. 취소")
                        var yesOrNo : Int
                        while (true){
                            try{
                                yesOrNo = readLine()!!.toInt()
                                if (yesOrNo == 1 || yesOrNo == 2){
                                    break
                                } else{
                                    println("올바른 숫자를 입력해 주세요")
                                }
                            }catch (e:NumberFormatException){
                                println("올바른 숫자를 입력해 주세요")
                                println("위 메뉴를 장바구니에 추가하시겠습니까?\n"+
                                        "1. 확인        2. 취소")
                            }
                        }
                        when(yesOrNo){
                            1 -> {
                                println("${Hamburger().name} 가 장바구니에 추가되었습니다.\n")
                                orderList.add(Hamburger())
                            }
                            2 ->{
                                println("주문을 취소하였습니다.")
                                menuNum = 1
                            }
                        }
                    }
                }//버거넘

            }//메뉴넘1번
            2 -> {
                println("Frozen custard는 아직..")
            }

        }//when 메뉴넘
        
    }//시작 whiletrue문


}//main

fun numCheck(a : Int , b: Int , print : String){
    var number : Int
    while (true){
        println("$print")
        try{
            number = readLine()!!.toInt()
            if (number !in 1..a){
                println("목록에 없는 번호입니다. 다시 입력해 주세요")
            }else{
                break
            }
        }catch (e:NumberFormatException){
            println("잘못된 형식입니다. 숫자를 다시 입력해 주세요")
        }
    }
}

/*    try {
                 menuNum = readLine()!!.toInt()
                if (menuNum > 5){
                    menuList.overMenu()
                } else break

            } catch (e:NumberFormatException){
                menuList.notInt()
            }
 */
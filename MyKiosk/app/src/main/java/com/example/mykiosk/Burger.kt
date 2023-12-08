package com.example.mykiosk

open class Burger (var name : String , var price : Double )  : Food() {

   fun BurgerMenu() {
      println(
          "[ Burgers MENU ]\n" +
                  "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                  "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                  "3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거\n" +
                  "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                  "0. 뒤로가기      | 뒤로가기")
    }


    fun burgerNumOver (){
        println(
            "메뉴판에 없는 번호입니다. 번호를 다시입력해 주세요\n\n"+
                    "[ Burgers MENU ]\n" +
                    "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                    "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                    "3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거\n" +
                    "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                    "0. 뒤로가기      | 뒤로가기")
    }


    fun burgerNumNotInt(){
        println(
            "잘못된 형식입니다. 번호를 다시입력해 주세요\n\n" +
                    "[ Burgers MENU ]\n" +
                    "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                    "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                    "3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거\n" +
                    "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                    "0. 뒤로가기      | 뒤로가기")
    }



    override fun showInfo() {

    }


}
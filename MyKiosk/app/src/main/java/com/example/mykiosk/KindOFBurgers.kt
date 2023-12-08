package com.example.mykiosk

class ShackBurger : Burger("ShackBurger" , 6.9) {
    private val info = "토마토, 양상추, 쉑소스가 토핑된 치즈버거"
    override fun showInfo() {
        println("${name}   | W $price | $info")
    }
}
class SmokeShack : Burger("SmokeShack" ,8.9 ) {
    private val info ="베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"
    override fun showInfo() {
        println("$name    | W $price | $info")
    }
}
class ShroomBurger : Burger("Shroom Burger" , 9.4){
    private val info = "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"
    override fun showInfo() {
        println("$name | W $price | $info")
    }
}
class Hamburger : Burger ("Hamburger" , 5.4){
    private val info = "비프패티를 기반으로 야채가 들어간 기본버거"
    override fun showInfo() {
        println("$name     | W $price | $info")
    }
}

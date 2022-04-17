package ru.netology


fun main() {
    val amount: Int = 4_699_00;
//    val resultCommission = if (amount > 4_668_00) amount/10000*75  else 3500
//    println("Сумма комиссии с перевода: $resultCommission")
    val comission = amount / 10000 * 75
    val resultComission = if (comission > 3500) comission else 3500

    println("$resultComission")
}
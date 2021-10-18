fun main() {

    val sum = 10_001
    var isMusiclover: Boolean = false

    val discountAmount = if (sum >= 1_001 && sum <= 10_000) 100
    else if (sum <= 1_000) 0
    else sum / 100 * 5

    val progressDiscount = if (isMusiclover == true && sum <= 1_000) sum / 100
    else if(isMusiclover == true) (discountAmount / 100) + discountAmount
    else 0

    var totalDiscount = discountAmount + progressDiscount
    var totalSum = sum - totalDiscount

    println("""Скидка покупателя $totalDiscount рублей.
        |Сумма $totalSum рубублей.
    """.trimMargin())


}
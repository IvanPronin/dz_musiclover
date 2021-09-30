fun main() {

    var sum: Int = 10_001

    var isMusiclover: Boolean = (sum == 10_001 || sum > 10_001)

    if(sum <= 1000){
        println("Cкидка применяется только к сумме от 1001 рубля \nВаша сумма $sum рублей")
    }else if(isMusiclover == true) {
        println("Скидка составляет 5% и т.к вы меломан еще вычитаем 1%")
        var discount: Int = sum - ((sum * 6) / 100)
        println("Ваша сумма со скидкой составляет $discount рублей")
    } else if (isMusiclover == false) {
        var discount_1: Int = sum - 100
        println("Ваша сумма со скидкой составляет $discount_1 рублей")
    }





}
fun main(){
    var a: Int = 20_000

    if (a <= 1000){
        println("Cкидка применяется только к сумме от 1001 рубля")
    } else if(a == 1001 || a <= 10_000){
        println("Скидка составляет 100 рублей")
        var sum: Int = a - 100
        println("Сумма со скидкой $sum рублей")
    } else if(a == 10_001 || a > 10_001){
        println("Скидка составляет 5% и т.к вы меломан еще вычитаем 1%")
        var sum1: Int = (a * 5) / 100
        var sum2: Int = a - sum1
        var sum3: Int = (sum2 /100)
        var result: Int = sum2 - sum3
        println("Ваша сумма со скидками составляет $result рублей")
    }

}
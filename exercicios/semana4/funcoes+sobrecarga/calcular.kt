fun calcular(num1: Int, num2: Int): Int {
    return num1 + num2
}
fun calcular(num1: Double, num2: Double): Double {
    return num1 + num2
}
fun calcular(num1: Int, num2: Int, num3: Int): Int {
    return num1 + num2 + num3
}
fun main () {
    val calcular1 = calcular(10,20)
    println(calcular1)
    val calcular2 = calcular(10.5,20.5)
    println(calcular2)
    val calcular3 = calcular(10,20,30)
    println(calcular3)
}
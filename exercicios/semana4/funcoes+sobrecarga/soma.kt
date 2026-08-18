fun soma (num1: Int, num2: Int): Int {
    return num1 + num2
}
fun soma (num1: Double, num2: Double): Double {
    return num1 + num2
}
fun main () {
    val soma1 = soma(10,20)
    println(soma1)
    val soma2 = soma(10.0,20.0)
    println(soma2)
}
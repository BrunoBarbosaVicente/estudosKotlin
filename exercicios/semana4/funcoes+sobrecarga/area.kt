fun calcularArea (lado: Double): Double{
    return lado * lado
}
fun calcularArea (largura: Double, altura: Double): Double {
    return largura * altura
}
fun main () {
    val calcularArea1 = calcularArea(5.0)
    println(calcularArea1)
    val calcularArea2 = calcularArea(5.0, 7.0)
    println(calcularArea2)
}
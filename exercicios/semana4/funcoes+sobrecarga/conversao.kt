fun conversor (hora: Int): Int{
    return hora * 60
}
fun conversor (metro: Double): Double{
    return metro * 10.000
}
fun main () {
    val conversor1 = conversor(2)
    println(conversor1)
    val conversor2 = conversor(2.0)
    println(conversor2)
}
fun maiorNumero (num1: Int, num2: Int): Int {
    if (num1 > num2) {
        return num1
    }
    return num2 
}
fun main () {
    val resultado = maiorNumero(30, 20)
    println(resultado)
}
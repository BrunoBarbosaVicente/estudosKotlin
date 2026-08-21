fun divisao(num1: Int, num2: Int): Int {
    var resultado = num1 / num2
    if (resultado == 0){
        println("Não é possivel dividir por zero")
    }
    return resultado
}
fun main () {
    println(divisao(10, 0))
}
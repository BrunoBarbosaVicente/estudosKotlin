var saldoConta = 1000.0
fun calculdora (operador: String, num1: Double, num2: Double): String {
    when (operador) {
        "x" -> println(num1 * num2)
        "/" -> println(num1 / num2)
        "+" -> println(num1 + num2)
        "-" -> println(num1 - num2)
        else -> println("operador invalido")
    }
    return operador
}
fun consultarSaldo (saldo: Double): String {
    return "Seu saldo é $saldo"
}
fun sacar (saque: Double) {
    saldoConta -= saque
}



fun main (){
    println("====================")
    println(   "Banco Kotlin"   )
    println("====================")
    println("")
    println("1 - Consultar saldo")
    println("2 - Sacar")
    println("3 - Depositar")
    println("0 - Sair")
    println("")
    println("Escolha um opção:")
    val opcao = readln().toInt()
    if ()
    
}
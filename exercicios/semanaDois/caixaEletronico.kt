fun main() {
    println("Bem-vindo ao caixa eletrônico!")
    println("Digite o valor que deseja sacar:")
    val saldo = 1000.0
    val valorSaque = readln().toDouble()
    when {
        valorSaque > saldo -> println("Saldo insuficiente para realizar o saque.")
        valorSaque <= 0 -> println("valor inválido. Por favor, digite um valor positivo.")
        else -> {
            val saque = saldo - valorSaque
            println("Saque realizado com sucesso! Seu saldo atual é: R$ $saque")
        }
    }
}
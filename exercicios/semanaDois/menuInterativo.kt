fun main() {
    println("Bem-vindo ao caixa eletrônico!")
    println("Digite a opção desejada:")
    println("1 - Saldo")
    println("2 - Saque")
    println("3 - Depósito")
    val opcao = readln().toInt()
    when (opcao) {
        1 -> {
            val saldo = 1000.0
            println("Seu saldo atual é: R$ $saldo")
        }
        2 -> {
            println("Digite o valor que deseja sacar:")
            val saldo = 1000.0
            val valorSaque = readln().toDouble()
            when {
                valorSaque > saldo -> println("Saldo insuficiente para realizar o saque.")
                valorSaque <= 0 -> println("valor invalido. Por favor, digite um valor positivo.")
                else -> {
                    val saque = saldo - valorSaque
                    println("Saque realizado com sucesso! Seu saldo atual é: R$ $saque")
                }
            }
        }
        3 -> {
            println("Digite o valor que deseja depositar:")
            val saldo = 1000.0
            val valorDeposito = readln().toDouble()
            when {
                valorDeposito <= 0 -> println("valor invalido. Por favor, digite um valor positivo.")
                else -> {
                    val deposito = saldo + valorDeposito
                    println("Deposito realizado com sucesso! Seu saldo atual é R$ $deposito")
                }
            }
        }
    }
}
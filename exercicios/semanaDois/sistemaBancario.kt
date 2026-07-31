fun main() {
    val saldo = 500.0
    val saque = 300.0
    val novoSaldo = saldo - saque
    if (saldo > saque){
        println("Saque realizado")
        println("Novo saldo: %.2f".format(novoSaldo))
    } else {
        println("Saldo insuficiente")
    }
}
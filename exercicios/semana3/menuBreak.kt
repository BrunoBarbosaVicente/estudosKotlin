fun main () {
    while (true) {
        println("1 - Saldo")
        println("2 - Saque")
        println("3 - Depósito")
        println("0 - Sair")
        println("Escolha uma opção:")
        val opcao = readln().toInt()
        if (opcao == 0) {
            break
        }
    }
    println("Saindo do sistema...")
}
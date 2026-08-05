fun main() {
    println("selecione uma opção:")
    val opcao = readln().toInt()
    when (opcao) {
        1 -> println("Depositar")
        2 -> println("Sacar")
        3 -> println("Consultar saldo")
        4 -> println("Sair")
        else -> println("Opção inválida. Digite um número de 1 a 4.")
    }
}
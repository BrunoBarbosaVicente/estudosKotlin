fun main() {
    var opcao: Int
    do{
        println("1 - Depositar")
        println("2 - Sacar")
        println("3 - Sair")
        opcao = readln().toInt()
    } while (opcao != 0)
    println("Operação finalizada.")
}
fun main() {
    var opcao = 1
    println("Menu Interativo")
    println("Escolha uma opção:")
    while (opcao != 0) {
        opcao = readln().toInt()
        when (opcao) {
            1 -> println("Opção 1 selecionada")
            2 -> println("Opção 2 selecionada")
            3 -> println("Opção 3 selecionada")
            4 -> println("Opção 4 selecionada")
            5 -> println("Opção 5 selecionada")
        }
        if (opcao == 0) {
            println("Saindo do menu....")
            break
        }
    }
}
fun menu () {
    println("===== Evento Kotlin =====")
    println("")
    println("1 - Cadastrar participante")
    println("2 - Listar participante")
    println("3 - Verificar participante")
    println("4 - Remover participante")
    println("5 - Quantidade de participantes")
    println("0 - Sair")
    println("")
}

fun main () {
    val nomes = mutableSetOf<String>()
    do {
        menu()
        print("Selecione a opção: ")
        val entradaMenu = readln().toInt()
        when(entradaMenu){
            1 -> {
                print("Insira o nome do participante que deseja adicionar: ")
                val entrada = readln()
                if (nomes.contains(entrada)){
                    println("$entrada já cadastrado.")
                } else {
                    nomes.add(entrada)
                    println("$entrada cadastrado com sucesso.")
                }
            }
            2 -> {
                if (nomes.isEmpty()){
                    println("A lista esta vazia.")
                } else {
                    println("Os participantes do evento são:")
                    for (nome in nomes){
                    println(nome)
                    }
                }
            }
            3 -> {
                print("Digite o nome que deseja verificar se esta na lista: ")
                val entrada = readln()
                if (nomes.contains(entrada)){
                    println("$entrada já encontra-se na lista.")
                } else {
                    println("$entrada não encontra-se na lista.")
                }
            }
            4 -> {
                print("Digite o nome que deseja remover da lista: ")
                val entrada = readln()
                if (nomes.contains(entrada)){
                    nomes.remove(entrada)
                    println("$entrada removido(a) da lista.")
                } else {
                    println("$entrada não encontrado.")
                }
            }
            5 -> {
                println("A lista contém ${nomes.size} participantes.")
            }
            0 -> {
                println("Programa encerrado...")
            }
        }
        
    } while (entradaMenu != 0)
    
}
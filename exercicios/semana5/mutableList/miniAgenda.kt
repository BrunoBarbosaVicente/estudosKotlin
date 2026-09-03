fun menu (){
    println("=====AGENDA=====")
    println("")
    println("1 - Adicionar contato")
    println("2 - Listar contados")
    println("3 - Remover contato")
    println("4 - Procurar contato")
    println("0 - Sair")
    
}
fun main () {
    val contatos = mutableListOf<String>()
    
    do {
        menu()
        println("Escolha uma opção:")
        val entrada = readln().toInt()
        when (entrada) {
            1 -> {
                println("Digite o nome do contato:")
                val entrada = readln()
                contatos.add(entrada)
            }
            2 -> {
                println("Lista de Contatos")
                for (contato in contatos){
                    println(contato)
                }
            }
            3 -> {
                println("Qual contato deseja excluir?")
                val entrada = readln()
                if (contatos.contains(entrada)){
                    contatos.remove(entrada)
                } else {
                    println("Contato nao encontrado.")
                }
            }
            4 -> {
                println("Qual nome deseja consultar?:")
                val entrada = readln()
                if (contatos.contains(entrada)){
                    println("Este nome está cadastrado.")
                } else {
                    println("Nome não cadastrado.")
                }
            }
            0 -> {
                println("Agenda Finalizada")
            }
        }
    } while (entrada != 0)
}
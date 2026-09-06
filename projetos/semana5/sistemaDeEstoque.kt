fun menu () {
    println("===== Estoque =====")
    println("")
    println("1 - Cadastrar produto")
    println("2 - Listar estoque")
    println("3 - Consultar produto")
    println("4 - Alterar quantidade")
    println("5 - Remover produto")
    println("6 - Quantidade de produtos")
    println("0 - Sair")
}

fun main () {
    val produtos = mutableMapOf<String, Int>()
    do{
        menu()
        print("Qual opção deseja: ")
        val entrada = readln().toInt()
        when (entrada) {
            1 -> {
                print("Nome do produto: ")
                val entradaProduto = readln()
                print("Quantidade: ")
                val entradaQuantidade = readln().toInt()
                if (produtos.containsKey(entradaProduto)){
                    println("Produto ja cadastrado.")
                } else {
                    produtos[entradaProduto] = entradaQuantidade
                    println("Produto cadastrado com sucesso.")
                }
            }
            2 -> {
                println("Produtos em estoque:")
                for ((produto, quantidade) in produtos){
                    println("$produto -> $quantidade unidades.")
                }
            }
            3 -> {
                print("Qual produto deseja consultar: ")
                val entradaProduto = readln()
                println("$entradaProduto possui ${produtos[entradaProduto]} unidade em estoque.")
            }
            4 -> {
                print("Qual produto deseja alterar: ")
                val entradaProduto = readln()
                print("Digite a nova quantidade: ")
                val novaQuantidade = readln().toInt()
                if (produtos.containsKey(entradaProduto)){
                    produtos[entradaProduto] = novaQuantidade
                    println("Quantidade de $entradaProduto foi atualizada para $novaQuantidade unidades")                   
                } else {
                    println("Produto não cadastrado.")
                }
            }
            5 -> {
                print("Digite o produto que deseja remover: ")
                val entradaProduto = readln()
                if (produtos.containsKey(entradaProduto)){
                    produtos.remove(entradaProduto)
                    println("Produto removido com sucesso.")
                } else {
                    println("Produto não cadastrado.")
                }
            }
            6 -> {
                println("A quantidade de produtos é ${produtos.size}")
            }
            0 ->{
                println("Programa encerrado...")
            }
        }   
    } while (entrada != 0)
}
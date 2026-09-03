fun main (){
    val produtos = mutableListOf("Mouse", "Teclado", "Monitor", "Headset")
    print("Digite o produto: ")
    val entrada = readln()
    val indice = produtos.indexOf(entrada)
    if (produtos.contains(entrada)){
        println("Produto encontrado")
        if (true) {
            println("Digite o novo nome:")
            val novoNome = readln()
            produtos[indice] = novoNome
        }
    } else {
        println("Produto não encontrado")
    }
    println("Lista atualizada")
    for (produto in produtos){
        println(produto)
    }
    
}
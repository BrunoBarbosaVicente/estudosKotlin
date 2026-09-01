fun main () {
    val produtos = listOf<String>("Arroz", "Feijão", "Macarrão", "Carne", "Leite")
    for (produto in produtos){
        println("Produto: $produto")
    }
    println("Quantidade de produtos: ${produtos.size}")
    print("Pesquise um produto: ")
    val entrada = readln()
    if (entrada in produtos) {
        println("Produto encontrado")
        println("Produto esta na posição ${produtos.indexOf(entrada)}")
    } else {
        println("Produto não encontrado")
    }
}
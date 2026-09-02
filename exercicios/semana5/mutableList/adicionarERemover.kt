fun main () {
    val produtos = mutableListOf("Arroz", "Feijão", "Macarrão", "Leite", "Café")
    produtos.remove("Leite")
    produtos.removeAt(0)
    produtos.add("Açúcar")
    for (produto in produtos){
        println(produto)
    }
}
fun main () {
    val produtos = mapOf("Mouse" to 100.0, "Teclado" to 150.0, "Monitor" to 900.0, "Headset" to 250.0)
    print("Digite o nome do produto: ")
    val entrada = readln()
    if (produtos.containsKey(entrada)) {
        println("Produtos encontrado!")
        println("Preço: R$ ${produtos[entrada]}")
    } else {
        println("Produto não encontrado.")
    }
}
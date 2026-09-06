fun main () {
    val produtos = mutableMapOf("Mouse" to 100.0, "Teclado" to 150.0, "Monitor" to 900.0, "Headset" to 250.0)
    print("Digite o produto que deseja alterar: ")
    val entrada = readln()
    if (produtos.containsKey(entrada)){
        print("Digite o novo valor: ")
        val entradaValor = readln().toDouble()
        produtos[entrada] = entradaValor
    } else {
        println("Produto não encontrado.")
    }
    for ((produto, preco) in produtos){
        println("$produto -> R$ $preco")
    }
}
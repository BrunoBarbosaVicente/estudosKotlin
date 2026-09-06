fun main (){
    val produtos = mutableMapOf("Mouse" to 100.0, "Teclado" to 150.0, "Monitor" to 900.0, "Headset" to 250.0)
    print("Digite o nome produto deseja remover: ")
    val entrada = readln()
    if (produtos.containsKey(entrada)){
        produtos.remove(entrada)
        println("Produto removido com sucesso.")
    } else {
        println("Produto não encontrado.")
    }
    println("Lista de produtos atualizada:")
    for ((produto, preco) in produtos){
        println("$produto -> R$ $preco")
    }
}
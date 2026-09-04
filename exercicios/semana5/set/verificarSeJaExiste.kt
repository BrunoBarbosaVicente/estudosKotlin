fun main () {
    val produtos = mutableSetOf("Mouse", "Teclado", "Monitor", "Headset")
    println("Informe o nome do produto que deseja consultar: ")
    val entrada = readln()
    if (produtos.contains(entrada)){
        println("Produto já cadastrado.")
    } else {
        println("Produto não cadastrado")
    }
}
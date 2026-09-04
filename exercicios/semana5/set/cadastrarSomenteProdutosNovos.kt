fun main () {
    val produtos = mutableSetOf<String>()
    println("Informe os produtos que deseja cadatrar:")
    var contador = 1
    var entrada: String
    do {
        println("Digite o $contador º produto")
        entrada = readln()
        if (produtos.contains(entrada)){
            println("Produto ja cadastrado.")
        } else if (entrada == "Sair") {
            break
        } else {
            produtos.add(entrada)
            contador ++
        }
    } while(entrada != "Sair")
    println("Produtos cadastrados:")
    for (produto in produtos){
        println(produto)
    }
    println("Total ${produtos.size}")
}
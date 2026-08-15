fun produto (nome: String, preco: Double, quantidade: Int) {
    println("Produto: $nome")
    println("Preço: R$ $preco")
    println("Quantidade: $quantidade")
}
fun main () {
    produto("Notebook", 4999.00, 1)
}
data class Produto(val nome: String, val preco: Double, val quantidade: Int)

fun main() {
    val produto1 = Produto("Mouse", 100.0, 2)
    val produto2 = Produto("Mouse", 100.0, 2)
    println(produto1 == produto2)
    println(produto1)
    val produto3 = produto1.copy(preco = 110.0)
    println(produto3)
    
    val (nome, preco, quantidade) = produto1
    println(nome)
    println(preco)
    println(quantidade)
    
    val produto4 = Produto("Teclado", 25.0, 3)
    val produto5 = Produto("Teclado", 25.0, 3)
    println(produto4 == produto5)
    val produto6 = produto4.copy(quantidade = 10)
    println(produto5 == produto6)
    
}
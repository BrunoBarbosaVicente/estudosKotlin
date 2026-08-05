fun main() {
    val preco = 2500.0
    val percentual = 15.0
    val desconto = preco * (percentual / 100)
    val valorFinal = preco - desconto
    println(valorFinal)
}
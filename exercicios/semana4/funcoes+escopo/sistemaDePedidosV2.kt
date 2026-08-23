fun calcularSubtotal(preco: Double, quantidade: Int): Double {
    val resultado =  preco * quantidade
    return resultado
}
fun calcularDesconto(subtotal: Double): Double {
    var percentual: Double
    if (subtotal >= 2000){
        percentual = 15.0
    } else if (subtotal >= 1000){
        percentual = 10.0
    } else {
        percentual = 0.0
    }
    val resultado = subtotal * (percentual / 100)
    return resultado
}
fun calcularTotal(subtotal: Double, desconto: Double): Double {
    val resultado = subtotal - desconto
    return resultado
}

fun mostrarPedido(produto: String, preco: Double, quantidade: Int, subtotal: Double, desconto: Double, total: Double) {
    println("====================")
    println("     SEU PEDIDO     ")
    println("====================")
    println("Produto: $produto")
    println("Preço unitário: %.2f".format(preco))
    println("Quantidade: $quantidade")
    println("Subtotal: R$ %.2f".format(subtotal))
    println("Desconto: R$ %.2f".format(desconto))
    println("Total: R$ %.2f".format(total))
}

fun main () {
    println("====== Sistema de Pedidos ======")
    println("Digite o nome do produto:")
    val produto = readln()
    println("Digite o preço:")
    val preco = readln().toDouble()
    println("Digite a quantidade:")
    val quantidade = readln().toInt()

    val subtotal = calcularSubtotal(preco, quantidade)
    val desconto = calcularDesconto(subtotal)
    val total = calcularTotal(subtotal, desconto)
    mostrarPedido(produto, preco, quantidade, subtotal, desconto, total)
}
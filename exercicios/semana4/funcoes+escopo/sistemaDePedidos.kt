fun calcularSubtotal(preco: Double, qtd: Int): Double {
    return preco * qtd
}
fun desconto(desconto: Double): Double {
    val resultado = desconto * (10.0 / 100)
    return resultado
}


fun main() {
    println("===== Sistema de Pedidos =====")
    println("Digite o nome do produto:")
    val produto = readln()
    println("Digite o preço:")
    val preco = readln().toDouble()
    println("Digite a quantidade:")
    val qtd = readln().toInt()
    println("==========================")
    println("        SEU PEDIDO        ")
    println("==========================")
    println("Produto: $produto")
    println("Preço unitário: %.2f".format(preco))
    println("Quantidade: $qtd")
    val subtotal = calcularSubtotal(preco, qtd)
    println("Subtotal: R$ %.2f".format(subtotal))
    val desconto = desconto(subtotal)
    println("Desconto: R$ %.2f".format(desconto))
    println("Total: R$ %.2f".format(subtotal - desconto))
}
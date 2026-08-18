
fun desconto (preco: Double, percentual: Double): Double {
    val descontoProduto = preco * (percentual / 100)
    val valorProduto = preco
    val percentual = percentual
    val valorFinal = preco - descontoProduto
    return valorFinal

    
}
fun main () {
    val resultadoFinal = desconto(100.0, 10.0)
    println(resultadoFinal)
    
}
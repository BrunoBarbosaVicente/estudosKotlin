fun cadastroDeProdutos(nome: String, vararg valores: Double): String {
    var total = 0.0
    for (valor in valores) {
        total += valor
    }
    return "$nome total do pedido: " + total
}
fun main () {
    println(cadastroDeProdutos("Bruno", 100.0, 50.0, 30.0))
}
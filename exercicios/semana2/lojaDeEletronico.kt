fun main() {
    val valorCompra = 1800.0
    val clienteVip = true
    if (valorCompra >= 2000.0 || clienteVip){
        println("Voce tem 15% de desconto nessa compra")
    } else {
        println("Sem desconto")
    }
}
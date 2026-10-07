enum class StatusPedido {PENDENTE,PAGO,ENVIADO,CANCELADO}
fun main() {
    val status = StatusPedido.PAGO
    when (status) {
        StatusPedido.PENDENTE -> println("pedido aguardando pagamento")
        StatusPedido.PAGO -> println("pagamento confirmado")
        StatusPedido.ENVIADO -> println("pedido enviado")
        StatusPedido.CANCELADO -> println("pedido cancelado")
    }
}
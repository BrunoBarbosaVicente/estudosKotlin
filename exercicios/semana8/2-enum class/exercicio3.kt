enum class PrioridadeChamado(val prazoHoras: Int) {BAIXA(48), MEDIA(24), ALTA(4); fun exibirPrazo(){println("Prazo: $prazoHoras horas.")}}
fun main() {
    val prioridade = PrioridadeChamado.ALTA
    println(prioridade)
    prioridade.exibirPrazo()
}
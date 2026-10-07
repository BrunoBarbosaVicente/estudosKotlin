enum class NivelAcesso {ADMINISTRADOR, TECNICO, USUARIO}
fun main(){
    val nivel = NivelAcesso.TECNICO
    println(nivel)
    println(nivel.name)
    println(nivel.ordinal)
}
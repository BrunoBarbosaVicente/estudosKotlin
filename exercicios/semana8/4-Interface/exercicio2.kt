interface Ligavel{
    fun ligar()
}
interface Conectavel{
    fun conectarRede()
}
interface DispositivoCompleto: Ligavel, Conectavel

class Computador: DispositivoCompleto{
    override fun ligar(){
        println("Computador esta ligado")
    }
    override fun conectarRede(){
        println("Computador esta conectado a rede")
    }
}
class Impressora: DispositivoCompleto{
    override fun ligar(){
        println("Impressora ligada")
    }
    override fun conectarRede(){
        println("Impressora esta conectada a rede")
    }
}
fun main(){
    val dispositivos: List<DispositivoCompleto> = listOf(Computador(), Impressora())
    for (dispositivo in dispositivos){
        dispositivo.ligar()
        dispositivo.conectarRede()
    }
}
interface Dispositivo{
    fun ligar()
    
}
class Computador : Dispositivo {
    override fun ligar(){
     println("Computador ligado")   
    }
}
class Impressora : Dispositivo {
    override fun ligar(){
        println("Impressora ligada")
    }
}
fun main() {
    val dispositivos: List<Dispositivo> = listOf(Computador(), Impressora())
    for (dispositivo in dispositivos){
        dispositivo.ligar()
    }
}
open class Funcionario() {
    open fun trabalhar(){
        println("esta trablahando")
    }
}
class Programador: Funcionario() {
    override fun trabalhar(){
        println("está programando.")
    }
}
class Suporte: Funcionario() {
    override fun trabalhar(){
        println("está atendendo")
    }
}
fun main(){
    val funcionarios :List<Funcionario> = listOf(Programador(), Suporte())
    for (funcionario in funcionarios){
        funcionario.trabalhar()
    }
}
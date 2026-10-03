open class Funcionario(val nome: String) {
    open fun trabalhar(){
        println("$nome iniciou o expediente.")
    }
}
class Programador(nome: String) : Funcionario(nome){
    override fun trabalhar(){
        super.trabalhar()
        println("$nome está programando")
        
    }
}
class Suporte (nome: String) : Funcionario(nome){
    override fun trabalhar(){ // override altera o metodo da classe pai, se o metodo estiver declarado como open.
        super.trabalhar()  // super.trabalhar executa o metodo da classe pai mesmo a class tendo sua propria execução.
        println("$nome começou a prestar um suporte.")
    }
}
fun main(){
    val programador = Programador("Bruno")
    programador.trabalhar()
    val suporte = Suporte("Bruno")
    suporte.trabalhar()
}
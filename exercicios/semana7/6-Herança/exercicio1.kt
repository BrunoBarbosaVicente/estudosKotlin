open class Funcionario(val nome: String, val salario: Double){
    open fun trabalhar(){
        println("$nome está trabalhando")
    }
}

class Programador(nome: String, salario: Double) : Funcionario(nome, salario){
    override fun trabalhar() {
     println("$nome esta trabalhando hoje.")   
    }
}

class Suporte(nome: String, salario: Double) : Funcionario(nome, salario){
    override fun trabalhar(){
        println("$nome iniciou o suporte")
    }
}

fun main(){
    val programador1 = Programador("Bruno", 15000.00)
    val suporte1 = Suporte("Bruno", 00.0)
    println(programador1.nome)
    println(programador1.salario)
    programador1.trabalhar()
    suporte1.trabalhar()
    
}
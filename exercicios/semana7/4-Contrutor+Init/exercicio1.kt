class Pessoa(var nome: String, var idade: Int, var email: String){
    init{
        println("Pessoa criada: $nome")
        println("Idade de $nome é $idade")
        println("Email de $nome é $email")
    }
}
fun main (){
    val pessoa1 = Pessoa("Bruno", 33, "teste@email.com")
    val pessoa2 = Pessoa("Carolina", 32, "teste2@email.com")
}
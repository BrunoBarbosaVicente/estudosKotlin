class Pessoa{
    var nome = ""
    var idade = 0
    var email = ""
    
    fun cadastrar(nome: String, idade: Int, email: String) {
        this.nome = nome
        this.idade = idade
        this.email = email
    }
}

fun main(){
    val pessoa1 = Pessoa()
    pessoa1.cadastrar("Bruno", 33, "teste@email.com")
    println(pessoa1.nome)
    println(pessoa1.idade)
    println(pessoa1.email)
}
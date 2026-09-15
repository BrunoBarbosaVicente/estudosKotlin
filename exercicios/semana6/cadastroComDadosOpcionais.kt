fun main () {
    var nome: String? = "Bruno"
    var idade: Int? = 33
    var email: String? = "teste@email.com"
    var telefone: String? = "(00)00000-0000"
    if (nome != null) {
        println(nome)
    }
    println(idade ?: "Idade nao informada")
    println(email?.length)
    telefone?.let{
        println(it)
    }
    println("Cadastro finalizado")
}
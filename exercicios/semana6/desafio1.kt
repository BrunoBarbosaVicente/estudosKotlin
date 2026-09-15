fun mostrarCadastro(nome: String?, idade: Int?, email: String?, telefone: String?) {
    if (nome != null) {
        println(nome)
    }
    println(idade ?: "Idade não informada")
    println(email?.length ?: "Email não informado")
    telefone?.let{
        println(it)
    }
    println("Cadastro finalizado.")
}

fun main (){
    mostrarCadastro("Bruno", 33, "teste@email.com", "(00)00000-0000")
}
fun validarCadastro(nome: String?, idade: Int?, email: String?): Boolean {
    if (nome?.length ?: 0 > 0){
        println(nome)
    } else {
        println("nome não prenchido.")
        return false
    }
    if (idade != null){
        println(idade)
    } else {
        println("Idade não foi informada.")
        return false
    }
    if (email?.length ?: 0 > 0){
        println(email)
    } else {
        println("e-mail não foi informado.")
        return false
    }
    println("cadastro válido")
    return true
}
fun main () {
    println("Cadastro de Clientes:")
    print("Digite o seu nome: ")
    val nome = readln()
    print("Digite a sua idade: ")
    val idade = readln().toInt()
    print("Digite o seu email: ")
    val email = readln()
    validarCadastro(nome, idade, email) 
}
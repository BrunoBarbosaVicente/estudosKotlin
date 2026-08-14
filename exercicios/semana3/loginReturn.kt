fun login(usuario: String, senha: String): String{
    if (usuario == "admin" && senha == "1234"){
        return "login realizado"
    }
    return "Usuario ou senha incorretos"
}

fun main () {
    println("digite seu usuario:")
    val usuario = readln()
    println("digite sua senha:")
    val senha = readln()
    println(login(usuario, senha))
}
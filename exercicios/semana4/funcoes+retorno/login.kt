fun login (user: String, senha: String): Boolean {
    return user == "admin" && senha == "1234"
}
fun main () {
    val verificarLogin = login("admin", "124")
    var login: String
    if (verificarLogin){
        login = "Acesso permitido"
    } else {
        login = "Acesso negado"
    }
    println(login)
}
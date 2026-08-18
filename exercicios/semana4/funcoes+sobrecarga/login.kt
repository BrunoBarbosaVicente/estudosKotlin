fun login(user: String, senha: String): Boolean {
    return user == "admin" && senha == "1234"
}
fun login(user: String, senha: String, tipoUsuario: String): Boolean {
    return user == "admin" && senha == "1234" && tipoUsuario == "Administrador"
}
fun main () {
    val verificarLogin1 = login("admin","124")
    if (verificarLogin1) {
        println("Acesso permitido")
    } else {
        println("Acesso negado")
    }
    val verificarLogin2 = login("admin", "1234", "Administrador")
    if (verificarLogin2){
        println("Acesso permitido")
    } else {
        println("Acesso negado")
    }
}
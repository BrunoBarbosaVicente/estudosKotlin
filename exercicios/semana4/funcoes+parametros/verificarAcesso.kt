fun verificarAcesso (user: String, senha: String) {
    if (user == "admin" && senha == "1234") {
        println("Acesso permitido")
    } else {
        println("Acesso negado")
    }
}
fun main () {
    verificarAcesso("admin", "1234")
}
fun main() {
    val usuario = "admin"
    val senha = "123456"
    val administrador = true
    if (usuario == "admin" && senha == "123456" && !administrador){
        println("Acesso permitido")
    } else {
        println("Acesso negado")
    }
}
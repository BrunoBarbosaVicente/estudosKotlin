fun main() {
    println("Sistema de Login")
    println("Digite seu nome de usuário:")
    val usuario = readln()
    val usuarioAdmin = "admin"
    val usuarioUser = "user"
    println("Digite sua senha:")
    val senha = readln()
    val senhaAdmin = "admin123"
    val senhaUser = "user123"
    // if (usuario == usuarioAdmin && senha == senhaAdmin) {
    //     println("Bem-vindo, administrador!")
    // } else if (usuario == usuarioUserComum && senha == senhaUserComum) {
    //     println("Bem-vindo, usuário comum!")
    // } else {
    //     println("Usuário ou senha incorretos. Acesso negado.")
    // }
    when {
        usuario == usuarioAdmin && senha == senhaAdmin -> println("Bem-vindo, administrador!")
        usuario == usuarioUser && senha == senhaUser -> println("Bem-vindo, usuário comum!")
        else -> println("Usuário ou senha incorretos. Acesso negado.")
    }
}
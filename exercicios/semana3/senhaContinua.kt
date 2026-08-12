fun main () {
    val senha = "1234"
    while (true) {
        println("digite a senha:")
        val entrada = readln()
        if (entrada == senha) {
            break
        }
        println("senha incorreta")
        println("tente novamente")
    }
    println("acesso permitido")

}
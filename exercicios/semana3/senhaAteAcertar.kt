fun main() {
    val senhaCorreta = "1234"
    var senha: String
    do {
        println("digite a senha")
        senha = readln()
    } while (senha != senhaCorreta)
    println("Acesso Liberado")   
}
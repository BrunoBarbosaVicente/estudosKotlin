fun main() {
    val senhaCorreta = "kotlin123"
    var senhaDigitada = ""
    while (senhaDigitada != senhaCorreta) {
        println("digite a senha correta:")
        senhaDigitada = readln()
    }
    println("Senha correta! Acesso concedido.")

}
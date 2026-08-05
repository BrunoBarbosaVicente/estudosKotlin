fun main () {
    var contador = 1
    val senhaCorreta = "1234"
    var tentativas = 0
while (tentativas < 3) {
    println("Senha:")
    val senha = readln()
    if (senha == senhaCorreta) {
        println("Acesso permitido!")
        break
    }
    tentativas++
    println("Tentativa $tentativas")
}
if (tentativas == 3){
    println("Conta bloqueada")
}
}
fun main() {
    val usuario = "admin"
    var entradaUser: String
    val senha = "1234"
    var entradaSenha: String
    var contador = 3
    var loginRealizado = false
    do {
        println("Digite seu usuario:")
        entradaUser = readln().lowercase()
        println("Digite sua senha:")
        entradaSenha = readln()
        contador--
            if (entradaUser != usuario || entradaSenha != senha){
                !loginRealizado
                println("Login incorreto, restam ${contador} tentativas")
                if(contador == 0){
                    println("conta bloqueada.")
                    break 
                }
            }
    } while (usuario != entradaUser || senha != entradaSenha || loginRealizado)
    println("Login realizado")
}
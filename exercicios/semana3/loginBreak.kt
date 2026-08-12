fun main () {
    val usuario = "mon4rka"
    val senha = "1234"
    var contador = 3
    while (contador > 0) {
        println("digite seu usuario:")
        val entradaUser = readln()
        println("digite sua senha:")
        val entradaSenha = readln()
        if (entradaUser == usuario && entradaSenha == senha) {
            println("acesso permitido")
            break
        }
        println("login incorreto")       
        if (contador == 1) {
            println("conta bloqueada")
        }               
        contador--
        println("restam $contador tentativas")    
    }        
}
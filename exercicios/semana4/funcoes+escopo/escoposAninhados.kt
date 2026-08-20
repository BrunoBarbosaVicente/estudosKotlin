fun main () {
    val idade = 20
    if (idade >= 18) {
        val mensagem = "Maior de idade"
        println(mensagem)
        if (mensagem == "Maior de idade") {
            val msg = "Sua idade é $idade"
            println(msg)
        }
       // println(msg) // novamente aqui nao consegue acessar
    }
   // println(mensagem) //  e aqui tbm nao consegue
}
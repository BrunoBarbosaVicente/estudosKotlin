fun main () {
    val fraseMap = mutableMapOf<String, Int>()
    val frase = "kotlin java kotlin python java kotlin"
    val palavras = frase.split(" ")
    for (palavra in palavras){
        if (fraseMap.containsKey(palavra)){
            val cotagemAtual = fraseMap[palavra]!!
            fraseMap[palavra] = cotagemAtual + 1
        } else {
            fraseMap[palavra] = 1
        }
    }
    for ((chave, valor) in fraseMap){
        println("$chave -> $valor")
    }
}


fun main (){
    val idades = mapOf("João" to 33, "Maria" to 28, "Carlos" to 40, "Ana" to 25)
    for (idade in idades.entries){
        println(idade)
    }
    println(idades["Maria"])
    println(idades["Carlos"])
    println(idades.size)
}
fun verificarIdade(idade: Int) : String {
    if (idade < 18){
        return "menor de idade"
    }
    return "maior de idade"
}

fun main () {
    println("Digite sua idade:")
    val idade = readln().toInt()
    println(verificarIdade(idade))
}
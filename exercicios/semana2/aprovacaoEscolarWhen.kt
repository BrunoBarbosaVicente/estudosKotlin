fun main() {
    println("Digite a sua nota:")
    val nota = readln().toDouble()
    when {
        nota >= 7.0 -> println("Aprovado")
        nota in 5.0..6.9 -> println("Recuperação")
        nota < 5.0 -> println("Reprovado")
        else -> println("Nota inválida. Digite uma nota entre 0 e 10.")
    }
}
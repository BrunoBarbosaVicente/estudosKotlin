    println("Digite a sua nota:")
    val nota = readln().toDouble()
    when (nota) {
        in 9.0..10.0 -> println("Aprovado com louvor")
        in 7.0..8.9 -> println("Aprovado")
        in 5.0..6.9 -> println("Recuperação")
        in 0.0..4.9 -> println("Reprovado")
        else -> println("Nota inválida. Digite uma nota entre 0 e 10.")
    }
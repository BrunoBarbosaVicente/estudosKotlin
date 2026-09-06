fun main () {
    val alunos = mutableMapOf<Int, String>()
    println("Cadastre 3 alunos.")
    var contador = 1
    while (contador <= 3){
        print("Digite numero da matricula: ")
        val entradaMatricula = readln().toInt()
        print("Digite o nome do aluno: ")
        val entradaNome = readln()
        alunos[entradaMatricula] = entradaNome
        contador++
    }
    print("Digite a matricula: ")
    val entradaMatricula = readln().toInt()
    if (alunos.containsKey(entradaMatricula)){
        println("Aluno encontrado: ${alunos[entradaMatricula]}")
        println("deseja alterar o nome do aluno: S/N ?")
        val entrada = readln()
        if (entrada == "S"){
            print("Digite o novo nome do aluno: ")
            val novoNome = readln()
            alunos[entradaMatricula] = novoNome
            println("nome atualizado com sucesso.")
        }
    } else {
        println("Matricula não encontrada.")
    }
    println("Lista de alunos atualizada")
    for ((matricula, nome) in alunos){
        println("$matricula -> $nome")
    }
}
class ContaBancaria(titular: String){
    var saldo = 0.0
        private set
        fun depositar (valor: Double){
            if (valor > 0){
                saldo += valor
            }
        }
        fun sacar (valor: Double){
            if (valor > 0 && valor <= saldo){
                saldo -= valor
            }
        }
        fun transferir (destino: ContaBancaria, valor: Double){
            if (valor > 0 && valor <= saldo){
                saldo -= valor
                destino.depositar(valor)
            }
        }
}
fun menu(){
    println("====== B-Bank =====")
    println("1 - Saque:")
    println("2 - Deposito:")
    println("3 - Transferencia:")
    println("4 - saldo")
    println("0 - Sair")
    println("")
    
}


fun main () {
    val conta1 = ContaBancaria("Bruno")
    val conta2 = ContaBancaria("Carolina")
    do{
        menu()
        print("Digite a operação desejada: ")
        val entrada = readln().toInt()
        when (entrada){
            1 -> {
                print("Qual conta deseja realizar o saque: ")
                val entradaConta = readln()
                print("Valor o valor que deseja sacar: ")
                val entradaSaque = readln().toDouble()
                if (entradaConta == "Bruno"){
                    conta1.sacar(entradaSaque)
                    println("Saque realizado com sucesso.")
                }
                if (entradaConta == "Carolina"){
                    conta2.sacar(entradaSaque)
                    println("Saque realizado com sucesso.")
                }
            }
            2 -> {
                print("Qual conta deseja depositar: ")
                val entradaConta = readln()
                print("Qual o valor que deseja depositar: ")
                val entradaValor = readln().toDouble()
                if (entradaConta == "Bruno"){
                    conta1.depositar(entradaValor)
                    println("Deposito realizado com sucesso.")
                }
                if (entradaConta == "Carolina"){
                    conta2.depositar(entradaValor)
                    println("Deposito realizado com sucesso.")
                }
            }
            3 -> {
                print("Qual valor deseja transferir: ")
                val entradaValor = readln().toDouble()
                print("Para quem vai transferir esse valor: ")
                val entradaDestino = readln()
                if (entradaDestino == "Bruno"){
                    conta2.transferir(conta1, entradaValor)
                }
                if (entradaDestino == "Carolina"){
                    conta1.transferir(conta2, entradaValor)
                }
            }
            4 -> {
                print("Qual conta deseja verificar o saldo: ")
                val entradaConta = readln()
                if (entradaConta == "Bruno"){
                    println("Seu saldo é ${conta1.saldo}")
                }
                if (entradaConta == "Carolina"){
                    println("Seu saldo é ${conta2.saldo}")
                }
            }
            0 -> {
                println("Sistema finalizado...")
            }
        } 
        
    } while (entrada != 0)
}
class ContaBancaria(titular: String){
    var saldo = 0.0
        private set
        fun depositar (valor: Double): Boolean{
            var saida = false
            if (valor > 0){
                saldo += valor
                saida = true
            }
            return saida
        }
        fun sacar (valor: Double): Boolean{
            var saida = false
            if (valor > 0 && valor <= saldo){
                saldo -= valor
                saida = true
            }
            return saida
        }
        fun transferir (destino: ContaBancaria, valor: Double): Boolean{
            var saida = false
            if (valor > 0 && valor <= saldo){
                saldo -= valor
                destino.depositar(valor)
                saida = true
            }
            return saida
        }
}
class Pessoa(var nome: String){
    
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
    print("Digito o nome da sua conta: ")
    val entradaNomeConta = readln()
    val pessoa1 = Pessoa(entradaNomeConta)
    print("Digite o nome da conta que deseja realizar transação: ")
    val entradaNomeConta1 = readln()
    val pessoa2 = Pessoa(entradaNomeConta1)
    val conta1 = ContaBancaria(pessoa1.nome)
    val conta2 = ContaBancaria(pessoa2.nome)
    
    
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
                if (entradaConta == pessoa1.nome){
                    if(conta1.sacar(entradaSaque)){
                        println("Saque realizado.")
                    } else {
                        println("Saldo indisponivel.")
                    }
                }
                if (entradaConta == pessoa2.nome){
                    if (conta2.sacar(entradaSaque)){
                        println("Saque realizado.")
                    } else {
                        println("Saldo indisponivel")
                    }
                }
            }
            2 -> {
                print("Qual conta deseja depositar: ")
                val entradaConta = readln()
                print("Qual o valor que deseja depositar: ")
                val entradaValor = readln().toDouble()
                if (entradaConta == pessoa1.nome){
                    if (conta1.depositar(entradaValor)){
                        println("Deposito realizado")
                    } else {
                        println("Deposito invalido, valor precisa ser maior que 0")
                    }
                }
                if (entradaConta == pessoa2.nome){
                    if (conta2.depositar(entradaValor)){
                        println("Deposito realizado")
                    } else {
                        println("Deposito invalido, valor precisa ser maior que 0")
                    }
                }
            }
            3 -> {
                print("Qual valor deseja transferir: ")
                val entradaValor = readln().toDouble()
                print("Para quem vai transferir esse valor: ")
                val entradaDestino = readln()
                if (entradaDestino == pessoa2.nome){
                    if (conta2.transferir(conta1, entradaValor)){
                        println("Transferencia realizada")
                    } else {
                        println("Saldo insuficiente")
                    }
                }
                if (entradaDestino == pessoa1.nome){
                    if (conta1.transferir(conta2, entradaValor)){
                        println("Transferencia realizada")
                    } else {
                        println("Saldo insuficiente")
                    }
                }
            }
            4 -> {
                print("Qual conta deseja verificar o saldo: ")
                val entradaConta = readln()
                if (entradaConta == pessoa1.nome){
                    println("Seu saldo de ${pessoa1.nome} é ${conta1.saldo}")
                } else if (entradaConta == pessoa2.nome){
                    println("Seu saldo de ${pessoa2.nome} é ${conta2.saldo}")
                } else {
                    println("Conta invalida.")
                }
            }
            0 -> {
                println("Sistema finalizado...")
            }
        } 
        
    } while (entrada != 0)
}
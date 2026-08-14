fun main (){
    var saldoConta = 1000.0
    do {
        println("====================")
        println("    Banco Kotlin    ")
        println("====================")
        println("")
        println("1 - Consultar saldo")
        println("2 - Sacar")
        println("3 - Depositar")
        println("0 - Sair")
        println("")
        println("Escolha um opção:")
        var opcao = readln().toInt()
        when (opcao) {
            1 -> { println("Seu saldo é de $saldoConta")
        }
            2 -> { println("Quanto deseja sacar?")
                 val saque = readln().toDouble()
                 if (saque > saldoConta){
                    println("Saldo insuficiente")
                    } else {
                        saldoConta -= saque
                        println("Saque realizado com sucesso")
                        println("Seu novo saldo é de $saldoConta")
                    }
                }
            3 -> { println("Quanto deseja depositar?")
                    val deposito = readln().toDouble()
                    if (deposito <= 0) {
                    println("Valor invalido")
                    } else {
                        saldoConta += deposito
                        println("Seu novo saldo é de $saldoConta")
                    }
                }
            0 -> { println("Saindo do sistema...")
                    continue
                }
            else -> { println("Opção invalida")
                }
        }        
    } while (opcao != 0)
    println("programa encerrado")       
}
class ContaBancaria(var titular: String){
    var saldo = 0.0
    private set
    fun depositar(valor: Double){
        if (valor > 0){
            saldo += valor
        }
    }
    fun sacar(valor: Double){
        if (valor > 0 && valor <= saldo){
            saldo -= valor
        }
    }
    fun tranferir(destino: ContaBancaria, valor: Double){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor
            destino.depositar(valor)
        }
    }
}
fun main() {
    val conta = ContaBancaria("Bruno")
    //conta.saldo = 1200.0  retorna erro dizendo que é private
    conta.depositar(1000.0)
    println(conta.saldo)
    conta.sacar(100.0)
    println(conta.saldo)
    
    val conta2 = ContaBancaria("Carolina")
    conta2.depositar(2000.0)
    conta2.tranferir(conta, 1000.0)
    println(conta.saldo)
    println(conta2.saldo)
    
}
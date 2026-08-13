fun main () {
    for (numero in 1..20){
        if (numero % 2 != 0){
            continue
        }
        println(numero)
    }
}
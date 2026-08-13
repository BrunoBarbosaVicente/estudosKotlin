fun main () {
    for (numero in 1..100){
        if (numero % 3 == 0){
            continue
        }
        println(numero)
    }
}
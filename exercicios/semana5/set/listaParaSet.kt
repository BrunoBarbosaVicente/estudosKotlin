fun main (){
    val stacks = mutableListOf("Java", "Kotlin", "Java", "Python", "Kotlin", "C++")
    val stacksUnicas = stacks.toSet()
    println("Lista Original:")
    for (stack in stacks){
        println(stack)
    }
    println("Stacks únicas:")
    for (stack in stacksUnicas){
        println(stack)
    }
}
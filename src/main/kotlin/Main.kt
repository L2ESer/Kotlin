fun main(args: Array<String>) {
    //println("Hello World!")
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")

    val InputVal = "AAADSSSRRTTHAAAA"
    var result = ""
    var countChar = 1

    var previousChar = InputVal[0]

    for (i in 1.. InputVal.length - 1){
        if (InputVal[i] == previousChar){
            countChar++
        } else {
            if (countChar>1){
                result = result + previousChar + countChar
            } else {
                result = result + countChar
            }
            countChar = 1
            previousChar = InputVal[i]
        }
    }
println(result)
}
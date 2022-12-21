//7 Kotlin Program to Find the Frequency of Character in a String

fun main()
{
    var str = "welcome"
    var ch = 'e'
    var fre = 0
    for (i in 0..str.length-1)
    {
        if (ch.equals(str[i]) )
        {
            fre++
        }
    }
    println("Frequency of Character String $ch: $fre")
}
fun main() {
    val likes = 1
    val people = if ((likes === 1 || (likes - 1).mod(10) === 0) && likes != 11) "человеку"
    else "людям"
    println("Понравилось $likes $people")
}
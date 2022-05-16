fun main() {
    val likes = 10356
    val people = if (likes.mod(10) === 1 && (likes-11).mod(100) != 0) "человеку"
    else "людям"
    println("Понравилось $likes $people")
}
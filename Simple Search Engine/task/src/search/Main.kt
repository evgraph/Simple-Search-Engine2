package search

fun main() {
    val line = readLine() ?: return
    val word = readLine() ?: return
    val indexOf = line.split(" ").indexOf(word)
    if (indexOf == -1) {
        println("Not found")
    }
    else {
        println(indexOf + 1)
    }

}

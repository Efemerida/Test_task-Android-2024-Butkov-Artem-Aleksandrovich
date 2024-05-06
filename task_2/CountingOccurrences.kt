fun main() {
    val elements = arrayOf("aaaa", '2', '3', '4', '5', '1', '2', '3', '4', 1, '2', 'a')
    val occurrences = countingOccurrencesOfElements(elements)
    for ((element, count) in occurrences) {
        println("Элемент: $element, Количество вхождений: $count")
    }
}

fun <T> countingOccurrencesOfElements(elements: Array<T>): Map<T, Int> {
    val occurrences = mutableMapOf<T, Int>()

    elements.forEach { e ->
        occurrences[e] = occurrences.getOrDefault(e, 0) + 1
    }
    return occurrences
}
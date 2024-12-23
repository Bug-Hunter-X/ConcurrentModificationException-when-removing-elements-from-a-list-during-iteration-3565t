```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)

    // Solution 1: Using iterator().remove()
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() > 2) {
            iterator.remove()
        }
    }
    println(list) // Output: [1, 2]

    // Solution 2: Creating a new list
    val newList = list.filter { it <= 2 }
    println(newList) // Output: [1, 2]

    // Solution 3: Using removeIf (most efficient for this scenario)
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    list2.removeIf { it > 2 }
    println(list2) // Output: [1, 2]
}
```
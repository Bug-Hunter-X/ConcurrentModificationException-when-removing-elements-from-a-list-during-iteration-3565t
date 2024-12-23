```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println(set) // Output: [1, 2]

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    map.removeIf { it.key > 2 }
    println(map) // Output: {1=one, 2=two}

    //This will throw ConcurrentModificationException
    val list2 = mutableListOf(1,2,3,4,5)
    for (item in list2){
        if (item > 2) list2.remove(item)
    }
    println(list2)
}
```
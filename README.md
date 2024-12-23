# ConcurrentModificationException in Kotlin

This repository demonstrates a common error in Kotlin: the `ConcurrentModificationException` that occurs when attempting to modify a collection while iterating over it using a traditional `for` loop.

The `bug.kt` file shows the problematic code.  The `bugSolution.kt` file provides solutions to avoid this exception.

The exception happens because the iterator's internal state is inconsistent with the list's structure after a removal operation.  Safe and efficient ways to avoid this are outlined in the solution file.
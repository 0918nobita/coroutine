package vision.kodai.coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun sub() = coroutineScope {
    // Concurrently executes both sections
    launch {
        delay(2000L)
        println("B1")
    }
    launch {
        delay(4000L)
        println("B2")
    }
    println("A")
}

// Sequentially executes sub followed by "Done"
fun main() = runBlocking {
    sub()
    println("Done")
}

package vision.kodai.coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun sub() = coroutineScope {
    // Concurrently executes both sections
    val job1 = launch {
        delay(2000L)
        println("B1")
    }
    val job2 = launch {
        delay(4000L)
        println("B2")
    }
    launch {
        job1.join()
        job2.join()
        println("C")
    }
    println("A")
}

// Sequentially executes sub followed by "Done"
fun main() = runBlocking {
    sub()
    println("Done")
}

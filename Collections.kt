val toRoman = mutableMapOf(
  "IIIII" to "V",
  "VV" to "X"
)

toRoman["VV"]

private val defaultSkunkWorks : MutableList<SkunkWork> = listOf(
    "Coffee Machine",
    "XBox",
    "Ping Pong Table",
)

val skunkwork = defaultSkunkWorks.map{ SkunkWork(it) }.toMutableList()

fun findAllSkunkWork(): MutableList<SkunkWork> {
    return skunkworkRepository.findAllSkunkWorks()
}

val skunkWorks: MutableList<SkunkWork> = findAllSkunkWorks()

val originalMap = mapOf("key1" to 1, "key2" to 2, "something_else" to 3)
val filteredMap = originalMap.filterKeys { it.contains("key") }


items.forEach { 
  k, v -> 
    println("$k = $v")
}

for ((k, v) in items) {
  println("$k = $v")
}

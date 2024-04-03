package sliding_window

fun findRepeatedDnaSequences(s: String): List<String> {
    // Check if the length of string os less than 10
    if (s.length < 10) return listOf()
    val dnaSet = hashSetOf<String>()
    val dnaMap = mutableMapOf<String, Int>()
    var dna = ""

    // using the sliding window algorithm pattern
    for (i in 0..s.length - 10){
        dna = s.substring(i,i+10)
        if (dnaMap[dna] != null) dnaSet.add(dna)
        dnaMap[dna] = 1
    }
    return dnaSet.toList()
}
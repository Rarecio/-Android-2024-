package second

class Counter {
    companion object {
        fun <T> count(array: Array<T>): Map<T, Int>{
            val map = HashMap<T, Int>()
            for (e in array){
                map[e] = map.getOrDefault(e, 0) + 1
            }
            return map
        }

        fun <T> count2(array: Array<T>): Map<T, Int> {
            return array.groupingBy { it }.eachCount()
        }
    }
}

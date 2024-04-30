package first

class DuplicateFinder {
    fun find(array: IntArray): Int {
        val set = hashSetOf<Int>()
        for (n in array){
            if (set.contains(n)){
                return n
            }
            set.add(n)
        }
        return 0
    }

    fun find2(array: IntArray): Int {
        return array.sum() - 5050
    }
}
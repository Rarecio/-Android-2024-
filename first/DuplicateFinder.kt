package first

class DuplicateFinder {
    companion object {
        fun find(array: IntArray): Int { // если массив где не все числа от 1 до 100
            val set = hashSetOf<Int>()
            for (n in array) {
                if (set.contains(n)) {
                    return n
                }
                set.add(n)
            }
            return 0
        }

        fun find2(array: IntArray): Int { // если массив где все числа от 1 до 100
            return array.sum() - 5050
        }
    }
}
class Solution {
    fun rand10(): Int {
        while (true) {
            var a: Int = rand7()
            var b: Int = rand7()
            var calculated: Int = b + (a - 1) * 7
            if (calculated <= 40) {
                return when {
                    calculated % 10 == 0 -> 10
                    else -> calculated % 10
                }
            }
        }
    }
    private fun rand7(): Int {
        return (1..7).random()
    }
}
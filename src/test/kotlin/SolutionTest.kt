import kotlin.test.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val sol: Solution = Solution()
    @Test
    fun rand10Test() {
        val result = sol.rand10()
        assertEquals(true, result in 1..10)
    }
}
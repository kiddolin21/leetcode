class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        // my solution ✌️
        var l = 0
        var r = numbers.size - 1
        while(l < r) {
            if (target == numbers[l] + numbers[r]) return intArrayOf(l + 1, r + 1)
            while(l < r && (numbers[l] + numbers[r] < target)) l++
            while(l < r && (numbers[l] + numbers[r] > target)) r--
        }
        throw Exception()
    }
}

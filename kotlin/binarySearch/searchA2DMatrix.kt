class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        // find row
        var u = 0
        var d = matrix.size - 1
        var row = -1
        while (u <= d) {
            val mid = u + (d - u) / 2
            if (matrix[mid][0] > target) {
                d = mid - 1
            } else {
                row = mid
                u = mid + 1
            }
        }
        if (row == -1) return false
        var l = 0
        var r = matrix[0].size - 1
        while (l <= r) {
            val mid = l + (r - l) / 2
            if (matrix[row][mid] == target) return true
            if (matrix[row][mid] < target) {
                l = mid + 1
            } else {
                r = mid - 1
            }
        }
        return false
    }
}

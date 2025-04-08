class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        // my solution - brute force: Time O(n^2), space O(n^2)
    //     if (board.size == 3) {
    //         return isValid(board)
    //     }
    //     val rotatedBoard = getRotatedBoard(board)
    //     for (i in 0..8) {
    //         if (!isValid(Array(1) { board[i] })) return false
    //         if (!isValid(Array(1) { rotatedBoard[i] })) return false
    //     }
    //     // REVIEW the split
    //     val blocks = Array(3) { Array(3) { Array(3) { CharArray(3) } } }
    //     for (blockRow in 0..2) {
    //         for (blockCol in 0..2) {
    //             for (i in 0..2) {
    //                 for (j in 0..2) {
    //                     blocks[blockRow][blockCol][i][j] = board[blockRow*3+i][blockCol*3+j]
    //                 }
    //             }
    //         }
    //     }
    //     for (i in 0..2) {
    //         for (j in 0..2) {
    //             if (!isValid(blocks[i][j])) return false
    //         }
    //     }
    //     return true
    // }

    // private fun isValid(board: Array<CharArray>): Boolean {
    //     val n = board.size
    //     val m = board[0].size
    //     val set = mutableSetOf<Char>()
    //     for (i in 0..n-1) {
    //         for (j in 0..m-1) {
    //             if (board[i][j] == '.') continue
    //             if (set.contains(board[i][j])) return false
    //             set.add(board[i][j])
    //         }
    //     }
    //     return true
    // }

    // private fun getRotatedBoard(board: Array<CharArray>): Array<CharArray> {
    //     val n = board.size
    //     val rotatedBoard = Array<CharArray>(n) { CharArray(n) }
    //     for (i in 0..n-1) {
    //         for (j in 0..n-1) {
    //             rotatedBoard[j][i] = board[i][j]
    //         }
    //     }
    //     return rotatedBoard
    // }
    // REVIEW: 1 pass solution same T&S
        val rows = Array(9) { HashSet<Char>() }
        val cols = Array(9) { HashSet<Char>() }
        val blocks = Array(9) { HashSet<Char>() }

        for (i in 0..8) {
            for (j in 0..8) {
                val value = board[i][j]
                if (value == '.') continue

                val blocksIndex = (i/3) * 3 + j / 3
                if (rows[i].contains(value) || cols[j].contains(value) ||
                    blocks[blocksIndex].contains(value)) return false
                
                rows[i].add(value)
                cols[j].add(value)
                blocks[blocksIndex].add(value)
            }
        }
        return true
    }

}

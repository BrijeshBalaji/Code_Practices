class Solution {
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        int[][] next = new int[rows][cols]; // new board for next state

        // Directions of 8 neighbors
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int live = 0;

                // count live neighbors
                for (int i = 0; i < 8; i++) {
                    int nr = r + dx[i];
                    int nc = c + dy[i];
                    if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {
                        if (board[nr][nc] == 1)
                            live++;
                    }
                }

                // apply rules
                if (board[r][c] == 1) {
                    if (live == 2 || live == 3)
                        next[r][c] = 1; // stay alive
                    else
                        next[r][c] = 0; // die
                } else {
                    if (live == 3)
                        next[r][c] = 1; // dead → alive
                }
            }
        }

        // copy back to board
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                board[r][c] = next[r][c];
            }
        }
    }
}
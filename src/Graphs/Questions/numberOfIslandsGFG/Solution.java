package Graphs.Questions.numberOfIslandsGFG;

class Solution {
    // Directions: 8 directions - up, down, left, right and 4 diagonals
    int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    
    public int countIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // Visited matrix to track visited cells
        boolean[][] visited = new boolean[n][m];

        int islandCount = 0;

        // Har cell ko traverse karo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Agar land hai aur visit nahi hua
                if (grid[i][j] == 'L' && !visited[i][j]) {
                    // DFS lagao, pura island visit karo
                    dfs(i, j, grid, visited, n, m);
                    islandCount++;  // ek island complete hua
                }
            }
        }

        return islandCount;
    }

    // DFS function to visit all connected 'L' cells
    void dfs(int x, int y, char[][] grid, boolean[][] visited, int n, int m) {
        visited[x][y] = true;

        // 8 directions mein check karo
        for (int dir = 0; dir < 8; dir++) {
            int newX = x + dx[dir];
            int newY = y + dy[dir];

            // Bounds ke andar ho, land ho, aur visit na hua ho
            if (newX >= 0 && newY >= 0 && newX < n && newY < m &&
                grid[newX][newY] == 'L' && !visited[newX][newY]) {
                dfs(newX, newY, grid, visited, n, m);
            }
        }
    }
}

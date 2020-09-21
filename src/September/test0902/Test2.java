package September.test0902;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Test2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] mn = s.split(",");
        int M = Integer.parseInt(mn[0]);
        int N = Integer.parseInt(mn[1]);
        String[] strings = new String[M];
        for (int i = 0; i < M; i++) {
            strings[i] = in.nextLine();
        }

        int cnt = 0;
        char[][] grid = new char[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = strings[i].charAt(j);
            }
        }

        cnt = numLakes(grid);
        System.out.println(cnt);

        int cnt2 = 0;
        char[][] grid2 = new char[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid2[i][j] = strings[i].charAt(j);
            }
        }
        cnt2 = numLakes2(grid2);
        System.out.println(cnt2);

    }

    static void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;
        //grid[r][c] == 'H' 是陆地 或 索引超了 就可以return
        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == 'H') {
            return;
        }

        //否则把当前标记成H,陆地
        grid[r][c] = 'H';
        //继续上下左右遍历
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);

    }

    public static int numLakes(char[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_Lakes = 0;
        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if (grid[r][c] == 'S') {
                    ++num_Lakes;
                    dfs(grid, r, c);
                }
            }
        }
        return num_Lakes;
    }

    public static int numLakes2(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;

        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == 'S') {
                    ++num_islands;
                    grid[r][c] = 'H';
                    Queue<Integer> neighbors = new LinkedList<>();
                    neighbors.add(r * nc + c);
                    while (!neighbors.isEmpty()) {
                        int id = neighbors.remove();
                        int row = id / nc;
                        int col = id % nc;
                        if (row - 1 >= 0 && grid[row - 1][col] == 'S') {
                            neighbors.add((row - 1) * nc + col);
                            grid[row - 1][col] = 'H';
                        }
                        if (row + 1 < nr && grid[row + 1][col] == 'S') {
                            neighbors.add((row + 1) * nc + col);
                            grid[row + 1][col] = 'H';
                        }
                        if (col - 1 >= 0 && grid[row][col - 1] == 'S') {
                            neighbors.add(row * nc + col - 1);
                            grid[row][col - 1] = 'H';
                        }
                        if (col + 1 < nc && grid[row][col + 1] == 'S') {
                            neighbors.add(row * nc + col + 1);
                            grid[row][col + 1] = 'H';
                        }
                    }
                }
            }
        }

        return num_islands;
    }


}

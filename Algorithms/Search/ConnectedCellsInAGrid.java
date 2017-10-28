/** Hackerrank practice questions
* Connected Cells In A Grid
* https://www.hackerrank.com/challenges/connected-cell-in-a-grid/problem
*
* @author	Berkay Giris
* @date		29.10.2017
*/


import java.io.*;
import java.util.*;

public class ConnectedCellsInAGrid {
    private static int n;
    private static int m;
    
    private static int dfs(int [][] grid, int x, int y) {
        if (x < 0 || x >= n)
        	return 0;
        if (y < 0 || y >= m)
        	return 0;
        if (grid[x][y] == 0) {
            return 0;
        }
        
        int len = 1;
        
        grid[x][y] = 0;
        
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (!(i == x && j == y)) {
                	len += dfs(grid, i, j);
                }
            }
        }

        return len;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        
        int [][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = in.nextInt();
            }
        }
        int max = 0;
        
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (grid[row][col] == 1) {
                    int result  = dfs(grid, row, col);
                    if(result > max)
                    	max = result;
                }
            }
        }
        
        
        System.out.println(max);
    }
}
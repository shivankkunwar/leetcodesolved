class Solution {
    
    static int[] islandAreas = new int[500 * 500];
    int islandIdx;
    int rowLast;
    int colLast;
    
    public int largestIsland(int[][] grid) {
        islandIdx = 2;
        islandAreas[2] = 0;
        rowLast = grid.length - 1;
        colLast = grid[0].length - 1;

        // Find the area of all islands and assign each island an index number 2..n
        for (int r = 0; r <= rowLast; r++) {
            int[] row = grid[r];
            for (int c = 0; c <= colLast; c++) {
                if (row[c] == 1) {
                    islandAreas[islandIdx] = 
                        findIslandArea(grid, r, c);
                    islandIdx++;
                }
            }
        }
        
        // Check all the 0's in the grid to see how much area they could connect.
        int maxArea = islandAreas[2];       // Just in case there are no 0's in the grid.
        for (int r = 0; r <= rowLast; r++) {
            int[] row = grid[r];
            for (int c = 0; c <= colLast; c++) {
                if (row[c] == 0) {
                    int area = 1;
                    int idxUp = 0;
                    int idxLeft = 0;
                    int idxDown = 0;
                    if (r > 0) {
                        int idx = grid[r - 1][c];
                        if (idx > 0) {
                            area += islandAreas[idx];
                            idxUp = idx;
                        }
                    }
                    if (c > 0) {
                        int idx = row[c - 1];
                        if (idx > 0 && idx != idxUp) {
                            area += islandAreas[idx];
                            idxLeft = idx;
                        }
                    }
                    if (r < rowLast) {
                        int idx = grid[r + 1][c];
                        if (idx > 0 && idx != idxUp && idx != idxLeft) {
                            area += islandAreas[idx];
                            idxDown = idx;
                        }
                    }
                    if (c < colLast) {
                        int idx = row[c + 1];
                        if (idx > 0 && idx != idxUp && idx != idxLeft && idx != idxDown)
                            area += islandAreas[idx];
                    }
                    if (area > maxArea)  maxArea = area;
                }
            }
        }
        return maxArea;
    }
    
    private int findIslandArea(int[][] grid, int r, int c) {
        int area = 1;
        grid[r][c] = islandIdx;
        if (r > 0 && grid[r - 1][c] == 1)  area += findIslandArea(grid, r - 1, c);
        if (c > 0 && grid[r][c - 1] == 1)  area += findIslandArea(grid, r, c - 1);
        if (r < rowLast && grid[r + 1][c] == 1)  area += findIslandArea(grid, r + 1, c);
        if (c < colLast && grid[r][c + 1] == 1)  area += findIslandArea(grid, r, c + 1);
        return area;
    }
}
class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length; // row 
        int n = dungeon[0].length; // column
        int[][] hp = new int[m][n];
        // has atleast 1 hp in the princess location
        hp[m-1][n-1] = Math.max(1, 1-dungeon[m-1][n-1]);
        // last row (right to left)
        for (int i = n-2; i >= 0; i--) {
            hp[m-1][i] = Math.max(1, hp[m-1][i+1] - dungeon[m-1][i]);
        }
        // last column (bottom to top)
        for (int j = m-2; j >= 0; j--) {
            hp[j][n-1] = Math.max(1, hp[j+1][n-1] - dungeon[j][n-1]);
        }
        // rest of the cells
        for (int i = m-2; i >= 0; i--){
            for (int j = n-2; j >= 0; j--){
                // right or down
                int minHp = Math.min(hp[i+1][j], hp[i][j+1]);
                hp[i][j] = Math.max(1, minHp - dungeon[i][j]);
            }
        }
        return hp[0][0];
    }
}

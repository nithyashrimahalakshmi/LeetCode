class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] Tra = new int[matrix[0].length][matrix.length];
        for(int m=0; m<(matrix[0].length); m++)
        {
            for(int n=0; n<(matrix.length);n++)
            {
                Tra[m][n] = matrix[n][m];
            }
        }
        return Tra;
    }
}

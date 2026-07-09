class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean firstRow = false, firstCol = false;

        // Step 1: check if first row has zero
        for (int j = 0; j < m; j++) {
            if (matrix[0][j] == 0) {
                firstRow = true;
            }
        }

        // Step 2: check if first col has zero
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                firstCol = true;
            }
        }

        // Step 3: mark using first row and col
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 4: update matrix
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 5: update first row
        if (firstRow) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 6: update first col
        if (firstCol) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}

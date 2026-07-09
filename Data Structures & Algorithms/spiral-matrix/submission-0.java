class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> res = new ArrayList<>();
        
        int row = matrix.length;
        int col = matrix[0].length;

        int i = 0;          
        int j = row - 1;    
        int k = 0;          
        int l = col - 1;    

        while (i <= j && k <= l) {
            for (int c = k; c <= l; c++) {
                res.add(matrix[i][c]);
            }
            i++;

            for (int r = i; r <= j; r++) {
                res.add(matrix[r][l]);
            }
            l--;

            if (i <= j) {
                for (int c = l; c >= k; c--) {
                    res.add(matrix[j][c]);
                }
                j--;
            }

            if (k <= l) {
                for (int r = j; r >= i; r--) {
                    res.add(matrix[r][k]);
                }
                k++;
            }
        }

        return res;
    }
}

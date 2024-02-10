public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        boolean x[]= new boolean[matrix.length];
        boolean y[]= new boolean[matrix[0].length];
        for(int i = 0; i < matrix.length; i++) { // x length
            for(int j = 0; j < matrix[0].length; j++) { // y length
                if (matrix[i][j]==0){
                    x[i]=true;
                    y[j]=true;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++) { // x length
            for(int j = 0; j < matrix[0].length; j++) { // y length
                if (x[i]||y[j]){
                   matrix[i][j]=0;
                }
            }
        }
    }




}

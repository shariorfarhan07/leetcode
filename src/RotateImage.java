public class RotateImage {
    public static void main(String[] args){
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        printmat(mat);
        rotate(mat);
        printmat(mat);


    }

    public  static   void  printmat(int[][] matrix){
        System.out.println();
        for(int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }

    }


    public static void rotate(int[][] matrix) {
    int b[][]=new int[matrix.length][matrix.length];
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix.length; j++) {
            b[i][j]=matrix[matrix.length-j-1][i];
        }
    }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                matrix[i][j]=b[i][j];
            }
        }





    }
}

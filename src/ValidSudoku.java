public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        return false;
    }
    public boolean leanerCheckz(char[][] board,int row) {
        boolean checker[]=new boolean[9];
        int n;
        for (int i = 0; i < board[row].length; i++) {
            n=Integer.parseInt(""+board[row][i]);
            if (n<=9 && n>=0) break;
            else if (checker[n]) {
                return true;
            }else checker[n]=true;
        }

        return false;
    }
    public boolean leanerChecky(char[][] board,int col) {
        boolean checker[]=new boolean[9];
        int n;
        for (int i = 0; i < board[col].length; i++) {
            n=Integer.parseInt(""+board[i][col]);
            if (n<=9 && n>=0) break;
            else if (checker[n]) {
                return true;
            }else checker[n]=true;
        }

        return false;
    }
    
    
}

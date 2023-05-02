import java.util.HashMap;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean b=true;
        for(int i = 0; i < board.length; i++) {
            b=leanerCheckx(board,i)&& leanerChecky(board,i);
            if (!b) break;
        }

        return b;
    }
    public boolean leanerCheckx(char[][] board,int row) {
        HashMap<Character,Integer> need=new HashMap<>();
        for(int i = 0; i < board.length; i++) {
            if (!".".equals(board[row][i]) && need.containsKey(board[i][row])) return false;
            need.put(board[i][row],i);
        }
        return true;
    }
    public boolean leanerChecky(char[][] board,int col) {
        HashMap<Character,Integer> need=new HashMap<>();
        for(int i = 0; i < board.length; i++) {
            if (! ".".equals(board[col][i]) && need.containsKey(board[col][i])) return false;
            need.put(board[col][i],i);
        }
        return true;
    }
    
    
}

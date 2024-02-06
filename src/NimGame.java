public class NimGame {
    public static void main(String[] args){
        System.out.println(canWinNim(8));
    }
    public static  boolean canWinNim(int n) {
    return canWinNimTurn(n,true);
    }
    public  static  boolean canWinNimTurn(int n, Boolean myTurn){
        System.out.println(n +" myturn "+myTurn+" condition "+(n-1==0||n-2==0||n-3==0));
        if (n<0) return false;
        if (n-1==0||n-2==0||n-3==0) return true && myTurn;
        return canWinNimTurn(n-3, !myTurn) ||canWinNimTurn(n-2, !myTurn)||canWinNimTurn(n-1, !myTurn);
    }


}

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII119 {
    public static void main(String[] args) {
        System.out.println(new PascalsTriangleII119().getRow(3));
    }
    public List<Integer> getRow(int rowIndex) {


    List<List<Integer>> l =new ArrayList<>();
    if (rowIndex==0) return new ArrayList<>();
    int t;
        for (int i = 0; i < rowIndex+1; i++) {
        l.add(new ArrayList<Integer>());
        l.get(i).add(0,1);
        for (int j = 1; j < i; j++) {
            t=l.get(i-1).get( j-1)+l.get(i-1).get(j);
//                System.out.println(t+" "+l.get(i-1).get( j-1)+" "+l.get(i-1).get(j)+" j:"+j+" i:"+i);
            l.get(i).add(j,t);
        }
        l.get(i).add(1);
    }
        l.get(0).remove(0);
        return l.get(rowIndex);}
}

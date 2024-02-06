import java.util.Arrays;
import java.util.Map;
import java.util.Stack;
// not working
public class LongestValidParentheses {
    public static void main(String[] args){
    System.out.println(longestValidParentheses(")()(()"));
    System.out.println(longestValidParentheses(")()"));
        System.out.println(longestValidParentheses("(()()((((()"));
        System.out.println(longestValidParentheses(")()())()()("));
    }
    public static int longestValidParentheses(String s) {
        int count =0;
        int valid=0;
        Stack<Integer> invalidIndex=new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(' ) {invalidIndex.push(i);}
            else if(s.charAt(i)==')' && !invalidIndex.isEmpty()) {invalidIndex.pop();}
            else {count++;invalidIndex.push(i);}
        }
        System.out.println(invalidIndex.toString());
        Object[] a=invalidIndex.toArray();
        int start=0;
        int end=0;
        if (a.length!=1){
        for(int i = 1; i < a.length; i++) {
            if ((int)a[i]-(int)a[i-1]>end-start){
                start=(int)a[i-1];
                end=(int)a[i];
            }
        }}else end=invalidIndex.peek();
        if (end==0)end=s.length();
        if (start==0)s=s.substring(start,end);
        else s=s.substring(end);




        count=0;
        valid=0;
        invalidIndex=new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(' ) {invalidIndex.push(i);valid++;}
            else if(s.charAt(i)==')' && !invalidIndex.isEmpty()) {invalidIndex.pop();valid++;}
            else count++;
        }
        count+=invalidIndex.size();
        System.out.println(invalidIndex.toString()+" start:"+start+" end:"+end+" count:"+count+" "+s +"valid:"+valid);




        return s.length()-count;



    }
}

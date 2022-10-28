import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Palindrome_Number_9 {
    public static void main(String[] args) {
        Palindrome_Number_9 p=new Palindrome_Number_9();
        System.out.println(p.isPalindrome3(123));
    }

    public boolean isPalindrome(int x) {
        Stack<Integer> firstHalf=new Stack<>();
        Stack<Integer> secondHalf=new Stack<>();
        while (x!=0){
            secondHalf.push(x%10);
            x/=10;
        }
        int size=secondHalf.size();
        for (int i = 0; i < size/2; i++) {
            firstHalf.push(secondHalf.pop());
        }
        if (secondHalf.size()!=firstHalf.size()){ secondHalf.pop();}
        while (secondHalf.size()!=0){
            if (secondHalf.pop() != firstHalf.pop()){
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome2(int x) {
        if (x<0)return false;
        List<Integer> num = new ArrayList<>();
        while (x!=0){
            num.add(x%10);
            x/=10;
        }
        int size =num.size();
        System.out.println(num.toString());
        for (int i = 0; i < size/2; i++) {
            if (num.get(i)!= num.get(size-1-i))return false;
        }
        return true;
    }
    public boolean isPalindrome3(int x) {
        if (x<0)return false;
        int backup=x,reverse=0,pow=1;
        while (x!=0){
            reverse=reverse*pow+(x%10);
            pow=10;
            x/=10;
        }
        return backup==reverse;
    }
}

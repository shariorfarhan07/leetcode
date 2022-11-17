import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid2(String s) {
        Stack<Character> parenthesis=new Stack<>();
        Map<Character,Character> map =new HashMap<>();
        map.put('(',')');map.put('{','}');map.put('[',']');
        boolean matched=true;
        for (int i = 0; i < s.length(); i++) {
            if ( s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')parenthesis.push(map.get(s.charAt(i)));
            else {
            matched=!parenthesis.isEmpty()&&parenthesis.pop()==s.charAt(i);
            if (!matched) return false;
            }
        }
        return parenthesis.isEmpty();
    }
    public boolean isValid(String s) {
        Stack<Character> parenthesis=new Stack<>();
        char catchh;
        boolean match;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')parenthesis.push(s.charAt(i));
            else {
                if (parenthesis.isEmpty())
                    return false;
                catchh=parenthesis.pop();
                match=(s.charAt(i)==')'&& catchh=='(') || (s.charAt(i)=='}'&& catchh=='{') ||(s.charAt(i)==']'&& catchh=='[');
                if (!match) return false;
            }
        }
        return parenthesis.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("()[]{}"));
        System.out.println(new ValidParentheses().isValid("(]{}"));
    }
}

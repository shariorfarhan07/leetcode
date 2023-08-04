public class Reverse_Words_in_a_String {
    public static void main(String[] args){
   System.out.println(  reverseWords("hi this is farhan he is the best"));
    }
    public static String reverseWords(String s) {
    StringBuilder st=new StringBuilder();
    String[] ch=s.split(" ");
    for (String c :ch )st.append(c).append(" ");
    return st.toString().trim();}
}

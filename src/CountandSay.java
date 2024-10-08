import java.util.Arrays;

public class CountandSay {
    static int counter=0;

    public static void main(String[] args){
//    System.out.println(countSay("112"));
    System.out.println("1:"+countAndSay(1));
    System.out.println("2:"+countAndSay(2));
    System.out.println("3:"+countAndSay(3));
    System.out.println("4:"+countAndSay(4));

//        System.out.println((int)'1'-48);
    }

//
//    countAndSay(1) = "1"
//    countAndSay(2) = say "1" = one 1 = "11"
//    countAndSay(3) = say "11" = two 1's = "21"
//    countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"

    public static String countAndSay(int n) {
        if (1==n) return "1";
        String s="1";
        while (--n>0){
            s=countSay(s);
        }
    return s;
    }

    public static String countSay(String a){
        int count=0;
        int s1=0,s2=0,end=a.length();
        String s="";
        while (s2<end){
            if (a.charAt(s1)==a.charAt(s2)){
                count++;
                s2++;
            }
            if (s2==end|| a.charAt(s1)!=a.charAt(s2)){
                s+=count+""+ a.charAt(s1);
                s1=s2;
                count=0;
            }
        }
        return  s;
    }

    public String countAndSay2(int n) {
        if(n==1) return "1" ;
        String s= countAndSay(n-1);

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            counter ++;
            if(i==s.length()-1 ||s.charAt(i)!=s.charAt(i+1)){
                sb.append(counter).append(s.charAt(i));
                counter=0;
            }
        }
        return sb.toString();
    }
}








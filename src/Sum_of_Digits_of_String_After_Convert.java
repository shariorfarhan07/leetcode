public class Sum_of_Digits_of_String_After_Convert {
    public static void main(String[] args){
        System.out.println(getLucky("zbax",2));
        System.out.println(getLucky("iiii",1));
        System.out.println(getLucky("leetcode",2));
    }



    public static int getLucky(String s, int k) {
    int n=0;
    String ss="";
    s=s.toUpperCase();
    for(int i = 0; i < s.length(); i++) {
        ss+=s.charAt(i)-64;
    }
    while (k-->0){
        n=0;
        for(int i = 0; i < ss.length(); i++) {
            n+=ss.charAt(i)-48;
        }
        ss="";
        ss=ss+n;
    }


    return n;
    }
}


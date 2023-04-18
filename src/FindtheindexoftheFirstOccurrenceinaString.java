public class FindtheindexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        System.out.println(strStr( "sadbutsad","sad"));
        System.out.println(strStr( "aasadbutsad","sad"));
        System.out.println(strStr( "mississippi","issip"));
        System.out.println(strStr( "mississippi","issi"));


    }

    public static int strStr(String haystack, String needle) {
        int haystackLength=haystack.length();
        int needleLength=needle.length();
        if (haystackLength==needleLength && haystack.equals(needle)) return 0;

        int f=0,s=0;
        while (f<haystackLength && s<needleLength){
//            System.out.println("-->"+haystack.charAt(f)+" "+needle.charAt(s));
//            System.out.println(f+" "+s);
            if (haystack.charAt(f)==needle.charAt(s)){
                s++;
                f++;
            } else {
                f=f-s+1;
                s=0;
            }

        }
        if (s==needleLength) return f-needleLength;

        return -1;
    }
}

public class ValidPalindrome125 {
    public boolean isPalindrome(String s) {
        int start=0,end=s.length()-1,size=end+1;
        String t="";
        s=s.toLowerCase();
        for (int i = 0; i < size; i++) {
            if ((s.charAt(i)>='a' && s.charAt(i)<='z' ) || (s.charAt(i)>='0' && s.charAt(i)<='9'))
                t+=s.charAt(i);
        }

        size=t.length();
        end=size-1;
        for (int i = 0; i < size/2; i++) {
            if (t.charAt(i)!=t.charAt(end-i))return  false;
        }

        return true;
    }

}

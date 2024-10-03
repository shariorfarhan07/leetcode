public class Length_of_Last_Word {
    public static void main(String[] args) {
        System.out.println(new Length_of_Last_Word().lengthOfLastWord("luffy is still joyboy"));
    }

    public int lengthOfLastWord(String s) {
        int len=s.length();
        int pointer=len-1;
        int end=pointer;
        for (int i = 0; i < len; i++) {
            if (end==pointer && s.charAt(pointer)== ' ') {
                end--;
            } else if ( s.charAt(pointer)== ' ') {
                break;
            }
            pointer--;

        }
        return end-pointer;
    }
}

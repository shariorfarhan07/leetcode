public class Longest_Common_Prefix_14 {
    public String longestCommonPrefix(String[] strs) {
        int length=0;
        int stringlen=0;
        int min=9999999;
        for (int i = 0; i < strs.length-1; i++) {
            while (strs[i].length()>stringlen&&strs[i+1].length()>stringlen&&strs[i].charAt(stringlen)==strs[i+1].charAt(stringlen++)){
                length++;
            }
            stringlen=0;
            min=Math.min(min,length);
            length=0;
        }


        return strs[0].substring(0,min);
    }

    public static void main(String[] args) {
        System.out.println(new Longest_Common_Prefix_14().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}

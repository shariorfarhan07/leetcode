public class Longest_Common_Prefix_14 {

    public static void main(String[] args) {
        System.out.println(new Longest_Common_Prefix_14().longestCommonPrefix8(new String[]{"flower", "flow", "flight"}));
    }

    public String longestCommonPrefix8(String[] strs) {
        int count =0;
        int len =Integer.MAX_VALUE;
        for (String s : strs) len=Math.min(len,s.length());
        boolean b=false;
        for(int j = 0; j <len-1 ; j++) {
            count++;
            for(int i = 0; i < strs.length-1; i++) {
                if (strs[i].charAt(j)==strs[i+1].charAt(j)){

                }else{
                    b=true;
                    break;
                }
                if (b) break;
            }
        }
        return strs[0].substring(0,count);
    }

    public String longestCommonPrefix1(String[] strs) {
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

// feels weird  I wrote both of the codes second one is much simpler than the first one
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==1) return strs[1];
        int min =Integer.MAX_VALUE;
        int minlengthoftwo=0,count=0;

        for(int i = 1; i < strs.length; i++) {
            minlengthoftwo=Math.min(strs[i-1].length() ,strs[i].length() );
            for(int j = 0; j < minlengthoftwo; j++) {
                if (strs[i-1].charAt(j)!=strs[i].charAt(j)) break;
                count++;
            }
            min=Math.min(min,count);
            count=0;
        }
        if (min==Integer.MAX_VALUE||min == 0) return "";
        return strs[0].substring(0,min);
    }
}

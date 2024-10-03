public class Add_Binary {

    public static void main(String[] args) {
        System.out.println(new Add_Binary().addBinary("110010","10111"));
        System.out.println(new Add_Binary().addBinary1("110010","10111"));
        System.out.println(new Add_Binary().addBinary("111","111"));
        System.out.println(new Add_Binary().addBinary1("111","111"));
    }

    public String addBinary(String a, String b) {

        StringBuilder sb=new StringBuilder();
        int carry=0,i=a.length()-1,j=b.length()-1;
    while (i >= 0 || j >= 0 || carry == 1) {
        if (i >= 0) {
            carry += a.charAt(i--) - '0';
        }
        if (j >= 0) {
            carry += b.charAt(j--) - '0';
        }
        sb.append(carry % 2);
        carry /= 2;
    }

    return sb.reverse().toString();
    }
//"1001001"

    public String addBinary1(String a, String b) {
       int aa=a.length()-1,bb=b.length()-1;
       String temp="0",s="";
       while (aa>=0 && bb>=0){
           if (a.charAt(aa)=='0' && b.charAt(bb)=='0'){
               s=temp+s;
               temp="0";
           } else if (a.charAt(aa)=='1' && b.charAt(bb)=='1') {
               s=temp+s;
               temp="1";
           }else if ((a.charAt(aa)=='1' || b.charAt(bb)=='1') && temp=="0") {
               s="1"+s;
               temp="0";
           }else if ((a.charAt(aa)=='1' || b.charAt(bb)=='1') && temp=="1") {
               temp="1";
               s="0"+s;
           }
           aa--;
           bb--;
       }
        while (aa>=0 ){
          if (temp=="1" && a.charAt(aa)=='1' ){
              s="0"+s;
          } else if (temp=="1" && a.charAt(aa)=='0') {
              s=temp+s;
              temp="0";
          }else{
              s=a.charAt(aa)+s;
          }
          aa--;
        }

        while (bb>=0 ){
            if (temp=="1" && b.charAt(bb)=='1' ){
                s="0"+s;
            } else if (temp=="1" && b.charAt(bb)=='0') {
                s=temp+s;
                temp="0";
            }else{
                s=b.charAt(bb)+s;
            }
            bb--;
        }
        if (temp=="1") s="1"+s;

       return s;
    }
}

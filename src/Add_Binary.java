public class Add_Binary {
    public String addBinary(String a, String b) {
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
//"1001001"

    public static void main(String[] args) {
        System.out.println(new Add_Binary().addBinary("110010","10111"));
    }
}

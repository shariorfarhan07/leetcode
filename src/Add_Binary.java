public class Add_Binary {
    public String addBinary(String a, String b) {
        String s="",ext;
        int aa=a.length();
        int bb=b.length();
        char temp='0';
        int min=(aa<bb)?aa:bb;
        for (int i = 1; i <=min ; i++) {
            System.out.println(a.charAt(aa-i)+"    "+b.charAt(bb-i));
            if      (a.charAt(aa-i)=='1'&&'1'==b.charAt(bb-i)) {

                s=temp+s;
                temp='1';

            }
            else if (a.charAt(aa-i)=='0'&&'0'==b.charAt(bb-i)) {
                s=temp+s;
                if (temp=='1')temp='0';
            }
        }
        if (aa>bb){
            ext=b.substring(0,bb-aa);
            if (temp=='1'){}
            else{s=ext+s;}

        }
        else if (aa<bb){
            ext=b.substring(0,bb-aa);
            if (temp=='1'){}
            else{s=ext+s;}
        }
        if (temp=='1')s=temp+s;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(new Add_Binary().addBinary("10101","101"));
    }
}

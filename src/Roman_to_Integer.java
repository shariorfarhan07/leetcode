import java.util.Hashtable;
//16%
public class Roman_to_Integer {
    public int romanToInt(String s) {
        Hashtable<Character,Integer> roman=new Hashtable<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        int len=s.length(),value=0,sum=0;
        for (int i = 0; i <len ; i++) {
//            System.out.println(s.charAt(i)+" "+roman.get(s.charAt(i)));
            value=roman.get(s.charAt(i));
            if (s.charAt(i)=='X'&& i>0 && i<len && s.charAt(i-1)=='I'){
                value-=2;
            }else if (s.charAt(i)=='V'&& i>0 && i<len && s.charAt(i-1)=='I'){
                value-=2;
            }
            else if (s.charAt(i)=='M'&& i>0 && i<len && s.charAt(i-1)=='C'){
                value-=200;
            }
            else if (s.charAt(i)=='C'&& i>0 && i<len && s.charAt(i-1)=='X'){
                value-=20;
            }// doubt ase
            else if (s.charAt(i)=='L'&& i>0 && i<len && s.charAt(i-1)=='X'){
                value-=20;
            }
            else if (s.charAt(i)=='D'&& i>0 && i<len && s.charAt(i-1)=='C'){
                value-=200;
            }
        sum+=value;
        }


        return sum;
    }


    public static void main(String[] args) {
        Roman_to_Integer obj=new Roman_to_Integer();
        System.out.println(obj.romanToInt("MCDLXXVI"));
    }
}

public class sumStrings {
    public static void main(String[] args){

    }

    public String multiply(String num1, String num2) {
    int num1i=num1.length()-1,num2i=num2.length()-1,carry=0,sum=0;
    StringBuilder out=new StringBuilder();
    while (num1i!=0&&num2i!=0){
        sum=carry+((num1i<0)?0:num1.charAt(num1i--)-48);
        sum+=((num2i<0)?0:num2.charAt(num2i--)-48);
        out.append(sum%10);
        carry=sum/10;
    }
    if (carry!=0) out.append(carry);

    return out.reverse().toString();
    }
}

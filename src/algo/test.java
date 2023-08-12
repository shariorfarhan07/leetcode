package algo;public class test {
    public static void main(String[] args){
        int s=0;
        int[] a=new int[]{1,2,3,4,5,6,7,9};

        for(int i = 0; i < a.length; i++) {
            s=s^a[i];
            s=s^(i+1);
            System.out.println(s+" "+(i+1));
        }
        s=s^(a.length+1);
        System.out.println(s);
    }
}

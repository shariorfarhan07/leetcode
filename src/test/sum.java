package test;


public class sum
{
    public static void main(String[] args)
    {
        int x = 9, y = 9;
        int carry=(x^y)<<1;
        System.out.println(carry);

    }

    public static int add(int x, int y)
    {
        String str = String.format("%" + x + "c%" + y + "c", ' ', ' ');
        System.out.println(str);
        return str.length();
    }
}
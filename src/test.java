public class test {
    public static void main(String[] args) {
        int count=1;
        int n=4;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n*2-2; j++) {
                if(j<n-i) System.out.print(" ");
            }
            for (int j = 0; j < n*2-2; j++) {
                if(i>=j) System.out.print(count++);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class UniquePaths {
    public  static int[][] mem=new int[3][3];
    public static int uniquePaths(int m, int n) {
        if (mem.length<m || mem[0].length<n) {
            mem=new int[m][n];
            for(int i = 0; i < m; i++) {
                for(int j = 0; j <n ; j++) {
                    mem[i][j]=-1;
                }
            }
        }
        if (n==1 && m==1) return 1;
        if (mem[m-1][n-1]!=-1) return mem[m-1][n-1];
        if (n==1) return uniquePaths(m-1,n);
        if (m==1) return uniquePaths(m,n-1);
        int a = uniquePaths(m-1,n)+ uniquePaths(m,n-1);
        mem[m-1][n-1]=a;
        return a;
    }


    public static int uniquePathsWithoutmem(int m, int n) {
        if (n==1 && m==1) return 1;
        if (n==1) return uniquePaths(m-1,n);
        if (m==1) return uniquePaths(m,n-1);
        return uniquePaths(m-1,n)+ uniquePaths(m,n-1);
    }



    public static void main(String[] args){
        System.out.println(uniquePaths(3,7));
        System.out.println(uniquePaths(3,2));
        System.out.println(uniquePaths(51,9));
    }
}

public class Search_2D_Matrix {
    public static void main(String[] args){
        int a[][]={{1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}};

        a= new int[][]{{1}};

        System.out.println(searchMatrix(a,0));
    }

    public static boolean searchMatrix(int[][] matrix, int target){
        int a [] =new int[matrix.length];
        for(int i = 0; i < a.length; i++) {
            a[i]=matrix[i][0];
        }
        int index1=binarySearch(a,target, true);
        if (index1==-1) return false;
        System.out.println(index1);
        int result=binarySearch(matrix[index1],target, false);
        return result!=-1;
    }


    public static int binarySearch(int[] a , int target,boolean root){
        int mid,start=0,end=a.length-1;
        while (start<=end){
            mid=(start+end)/2;
              System.out.println(mid +" "+start+" "+end);
            if (target==a[mid]){
            return mid;
            }else if (target<a[mid]) {
                end=mid-1;
            }else {
                start=mid+1;
            }

        }
        if (root) return start-1;
        return -1;
    }
}

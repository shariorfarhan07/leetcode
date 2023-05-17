public class Searcha2DMatrix {
    public static void main(String[] args){

        int a[] =new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(a,6,0,a.length));

    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int b=-1;
        for(int i = 0; i < matrix.length; i++) {
            b=binarySearch(matrix[i],target,0,matrix[i].length);
            if (b != -1) {
                return  true;
            }
        }
        return false;
    }

    public static int binarySearch(int[] array, int target,int start,int end){
        int mid=(start+end)/2;
        if (start==end) return -1;
        if (target == array[mid]) return mid;
        if (target > array[mid]) return binarySearch(array,target,mid+1,end);
        if (target < array[mid]) return binarySearch(array,target,start,mid-1);
        return -1;
    }
}

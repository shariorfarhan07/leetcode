import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nw = new int[n + m];
        int i = 0, i1 = 0, i2 = 0;
        while (i1 < m && i2 < n) {
            if (nums1[i1] < nums2[i2]) {
                nw[i++] = nums1[i1++];
            } else {
                nw[i++] = nums2[i2++];
            }
        }
        while (i1 < m) nw[i++] = nums1[i1++];
        while (i2 < n) nw[i++] = nums2[i2++];
        for (int j = 0; j < nums1.length; j++) {
           nums2[j]= nw[j] ;
        }

    }

    public static void main(String[] args) {
        int[]a= {1,2,3,0,0,0};
        int[]b= {1,2,3};
        new MergeSortedArray().merge(a,3,b,3);
        System.out.println(Arrays.toString(a));
    }
}

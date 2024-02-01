public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a []=new int[nums1.length+nums2.length];
        int n1=0;
        int n2=0;
        int i=0;
        double median=0;
        while( n1<nums1.length && n2<nums2.length ){
            if( nums1[n1] < nums2[n2] ){
                a[i++]=nums1[n1++];
            }else{
                a[i++]=nums2[n2++];
            }

        }
        while(n1<nums1.length) a[i++]=nums1[n1++];
        while(n2<nums2.length) a[i++]=nums2[n2++];
        if (a.length%2==0){
            median=((double)a[a.length/2]+a[+a.length/2-1])/2.0;
        }else{
            median=a[a.length/2];
        }

        return median;
    }
}

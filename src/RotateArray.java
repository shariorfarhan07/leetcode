import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args){
        int[] a=new int[]{1,2,100,4,5,6,7,8,9};
        System.out.println(Arrays.toString(a));
        rotate(a,5);
        System.out.println(Arrays.toString(a));
        a=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(a));
        rotate(a,2);
        System.out.println(Arrays.toString(a));

    }

    private static void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] a=new int[k];
        int newItr=k-1,oldItr=nums.length-1;
        while (newItr>=0) a[newItr--]=nums[oldItr--];
        newItr=nums.length-1;
        while (oldItr>=0) nums[newItr--]=nums[oldItr--];
        for(int i = 0; i < k; i++) nums[i]=a[i];
    }




}

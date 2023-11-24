package leetcode75;

import java.util.Arrays;

public class productOfArrayExceptSelf {
    public static void main(String[] args){
    int[] a=new int[]{1,2,3,4};
    System.out.println(Arrays.toString(productExceptSelf(a)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] out=new int[nums.length];
        int pre=1,post=1;
        for(int i = 0; i < out.length; i++) {
            out[i]=pre;
            pre*=nums[i];
        }
//        System.out.println(Arrays.toString(out));
        for(int i = out.length-1; i>=0; i--) {
            out[i]*=post;
            post*=nums[i];
        }
//        System.out.println(Arrays.toString(out));
        return out;}
    public static int[] productExceptSelf1(int[] nums) {
        int[] post=new int[nums.length];
        int[] pre=new int[nums.length];
        pre[0]=nums[0];
        for(int i = 1; i < pre.length; i++) {
        pre[i]=nums[i]*pre[i-1];
        }
//        System.out.println("pre"+Arrays.toString(pre));

        post[post.length-1]=nums[post.length-1];
        for(int i=post.length-2;i>=0; i--){
            post[i]=nums[i]*post[i+1];
        }
//        System.out.println("post"+Arrays.toString(post));

        int[] out =new int[nums.length];
        out[0]=post[1];
        out[nums.length-1]=pre[nums.length-2];
        for(int i = 1; i < out.length-1; i++) {
            out[i]=pre[i-1]*post[i+1];
        }

        return out;
    }

}

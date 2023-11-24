public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] a = new int[]{2, 3, -2, 4};
        a = new int[]{-2};
        System.out.println(maxProduct(a));
    }

    public static int maxProduct(int[] nums) {
        if (nums.length==1) return nums[0];
        int res = 0;
        int max = 1, min = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                max = 1;
                min = 1;
                continue;
            }
            int tmp = max * nums[i];
            max = max(nums[i] * min, nums[i] * max, nums[i]);
            min = min(nums[i] * min, tmp, nums[i]);
//            System.out.println(res + " " + max + " " + min);
            res = Math.max(res, max);
        }
        return res;
    }


    public static int max(int a,int b,int c) {
        return (a > b) ? (a > c ? a : c) : (b > c ? b : c);
    }

    public static int min(int a,int b,int c) {
        return (a < b) ? (a < c ? a : c) : (b < c ? b : c);
    }



}
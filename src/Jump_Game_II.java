import java.util.Arrays;

public class Jump_Game_II {
    public static void main(String[] args){
        int a[]=new int[]{2,3,1,1,4};
        System.out.println(jump(a));
        a=new int[]{3,2,1,0,4};
        System.out.println(jump(a));

        a=new int[]{2,0,2,4,6,0,0,3};
        System.out.println(jump(a));
        a=new int[]{1,1,1,1};
        System.out.println(jump(a));


    }

    public static int jump(int[] nums) {
        int[] steps=new int[nums.length];
        int max=0;
        for(int i = 0; i < steps.length-1; i++) {
            max+=nums[i];
        }
        for(int i = 0; i < steps.length-1; i++) {
            steps[i]=max+1000;
        }
        for(int i = nums.length-2; i >=0; i--) {

            for(int j = 0; j <= nums[i]; j++) {
                if (i+j>=nums.length){
                    steps[i]=1;
                    break;
                }
                else steps[i]=Math.min(steps[i+j]+1,steps[i]);
//                System.out.println(i+"=>"+Arrays.toString(steps));
            }
        }
//            System.out.println(Arrays.toString(nums));
//            System.out.println(Arrays.toString(steps));
        return steps[0];
    }

}

import java.util.Arrays;
import java.util.Map;

public class JumpGame {
    public static void main(String[] args){
        int a[]=new int[]{2,3,1,1,4};
        System.out.println(canJump(a));
        a=new int[]{3,2,1,0,4};
        System.out.println(canJump(a));
        a=new int[]{2,3,1,1,4};
        System.out.println(canJumpMinSteps(a));
        a=new int[]{3,2,1,0,4};
        System.out.println(canJumpMinSteps(a));

    }

    public static int canJumpMinSteps(int[] nums) {
        if (nums.length==1) return -1;
        if (nums.length!=0 && nums[0]==0) return -1;
        int[]steps=new int[nums.length];
        for(int i = 0; i < steps.length-1; i++) steps[i]=-1;
        for(int i = 0; i < steps.length-1; i++) {

        }

        return 0;
    }

    public static boolean canJump(int[] nums) {
        if (nums.length==1 && nums[0]==0) return true;
        if (nums.length!=1 && nums[0]==0) return false;
        boolean reachable[]=new boolean[nums.length];
        reachable[nums.length-1]=true;
        for(int i = nums.length-2; i >= 0; i--) {
            int reach=nums[i]+i;
            if (reach>=nums.length){ reachable[i]=true; continue;}
            if (reachable[nums[i]+i]){ reachable[i]=true; continue;}
            while (nums[i]--!=0){
                if (reachable[nums[i]+i]){
                    reachable[i]=true;
                    break;
                }
            }
        }
//        System.out.println(Arrays.toString(reachable));
        return reachable[0];
    }


    public static boolean canJump1(int[] nums) {
        int canReach=0;
        if (nums.length==1 && nums[0]==0) return true;
        if (nums.length!=1 && nums[0]==0) return false;
        for(int i = 0; i < nums.length; i++) {
            if (i>canReach) return false;
            canReach=Math.max(canReach,i+nums[i]);
        }
        return true;
    }
}

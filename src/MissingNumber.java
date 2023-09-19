public class MissingNumber {
    public static void main(String[] args){

    }
    public static int missingNumber(int[] nums) {
        int totalSum=nums.length;
        totalSum=(totalSum*(totalSum+1))/2;
        int sum=0;
        for(int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        return totalSum-sum;
    }
}

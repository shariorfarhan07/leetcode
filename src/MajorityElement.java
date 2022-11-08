public class MajorityElement {
    /*challange is to run the program in liner TC O(n) and constant MC O(1)
     * using boyer-moore voting algorithm we can achieve the required TC & MC.
     * */
    public int majorityElement(int[] nums) {
        int count = 0, majorElement = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majorElement = nums[i];
                count++;
            } else if (majorElement == nums[i]) {
                count++;
            } else {count--;}
        }
            return 0;

    }
}

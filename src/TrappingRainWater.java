import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args){
        System.out.println(trap(new int[]{4,2,0,3,2,5}));
        System.out.println(trap(new int[]{5,4,1,2}));
        System.out.println(trap(new int[]{0,0,2,0,0,0,2,0,0}));
    }
    public static int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int l = 0, r = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int sum = 0;

        while (l < r) {
            if (height[l] < height[r]) {
                leftMax = Math.max(leftMax, height[l]); // Update left max
                sum += leftMax - height[l];  // Calculate trapped water
                l++;
            } else {
                rightMax = Math.max(rightMax, height[r]); // Update right max
                sum += rightMax - height[r];  // Calculate trapped water
                r--;
            }
        }

        return sum;
    }
    public static int trap2(int[] height) {
        int sum=0,leftMax=height[0],rightMax=height[height.length-1],l=0,r=height.length-1;
        while (l<r){
            if (height[l]>leftMax){
                leftMax=height[l];
            }
            if (height[r]>rightMax){
                rightMax=height[r];
            }


            if (height[l]<height[r]){

                sum+= Math.max((leftMax - height[l]), 0);
                l++;
            }else{

                sum+= Math.max((rightMax - height[r]), 0);
                r--;
            }
        }
        return sum;
    }




    public static int trapw(int[] height) {
        int[] water = new int[height.length];
        water[0] = height[0];
        water[height.length-1] = height[height.length-1];
        int max =0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {max=height[i];}
        }
        int count=0;
        for (int i : height){
            if (i==max) count ++;
        }

        for (int i = 0; i < height.length-1; i++) {
            if (i != 0 && height[i] < water[i-1]) {
                water[i] = water[i-1];
            }else {
                water[i] = height[i];
            }
            if (water[i] == max && count <2) {
                break;
            }
        }
//        System.out.println(Arrays.toString(water));

        for (int i = height.length-1; i>=0; i--) {
            if ( i!=height.length-1 && height[i] < water[i+1]) {
                water[i] = water[i+1];
            }else {
                water[i] = height[i];
            }
            if (water[i] == max ) {count--;}
            if (water[i] == max && count <2) {
                break;
            }
        }
//        System.out.println(Arrays.toString(water));
        int sum =  0;
        for (int i = 0; i < height.length; i++) {
            sum += Math.abs(water[i]-height[i]);
        }
        return sum;
    }

}

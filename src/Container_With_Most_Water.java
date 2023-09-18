public class Container_With_Most_Water {
    public static void main(String[] args){

        int[] array=new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(array));
    }
//     2 pointer
    public static int maxArea(int[] height) {
        int right=height.length-1,left=0,maximumArea=0,currentArea=0;
        while (left<right){
            currentArea=(right-left)*Math.min(height[left],height[right]);
//            System.out.println(currentArea);
            maximumArea=Math.max(maximumArea,currentArea);
            if (height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }
        return maximumArea;
    }

    //brute force
    public static int maxArea1(int[] height) {
        int max=0;
        int smallOne=0;
        int width=0;

        for(int i = 0; i < height.length; i++) {
            for(int j = i+1; j < height.length; j++) {
                smallOne=Math.min(height[i],height[j]);
                width=j-i;
                max=Math.max(max,smallOne*width);
            }
        }


        return max;
    }
}

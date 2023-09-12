public class Container_With_Most_Water {
    public static void main(String[] args){

        int[] array=new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(array));
    }
    public static int maxArea(int[] height) {
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

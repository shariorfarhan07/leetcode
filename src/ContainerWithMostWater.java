public class ContainerWithMostWater {
public static void main(String[] args){
    int[] a={1,8,6,2,5,4,8,3,7};
    System.out.println(maxArea(a));
 }

    public static int maxArea(int[] height) {
            int maxA=0,max1=0,max2=0;

            for(int i = 0; i < height.length; i++) {
                if (max1>height[i]){ max2=max1;max1=i; }
//                if (maxA>)

            }

        return 0;
    }

}

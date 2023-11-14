public class ContainerWithMostWater {
public static void main(String[] args){
    int[] a={1,8,6,2,5,4,8,3,7};
    System.out.println(maxArea(a));
 }

    public static int maxArea(int[] height) {
    int l=0,r= height.length,max=0;
    while (l<r){
        if (max<Math.min(height[l],height[r])*Math.abs(l-r))
        if (height[l]>height[r]){r--;}
        else {l++;}
    }

        return max;
    }

}

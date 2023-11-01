public class Trapping_Rain_Water {
    public static void main(String[] args){
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }



    public static int trap(int[] height) {
    if (height.length<=2) return 0;
    int right=height.length-1;
    int left=0;
    int sum=0;
    int maxleft=0,maxRight=0,leftIndex=0,rightIndex=0;
    while (left<right){
        if (maxleft<height[left]){maxleft=height[left];leftIndex=left;}
        if (maxRight<height[right]){maxRight=height[right];leftIndex=right;}
        left++;
        right--;
    }
    left=maxleft;
    right=maxRight;
    sum=(Math.abs(right-left)-2)*Math.min(height[left],height[right]);
    while (--right!=left) sum-=height[right--];

    return 0;}

}

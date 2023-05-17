import java.util.Arrays;

public class Two_Sum_II__Input_Array_Is_Sorted {
    public static void main(String[] args){
        int[] a=new int[]{2,7,11,15};
        System.out.println(Arrays.toString(twoSum(a,9)));
    }
    public static int[] twoSum(int[] numbers, int target) {
    int[] out=new int[]{-1,-1};
    int l=numbers.length-1;
    int f=0;
    while (f<l){
        if (numbers[f]+numbers[l]>target) l--;
        else if(numbers[f]+numbers[l]>target) f++;
        else{ out= new int[]{f+1,l+1}; break;}
    }
    return out;
    }
}

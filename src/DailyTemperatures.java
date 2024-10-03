import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DailyTemperatures {
public static void main(String[] args){
   int a [] =new int[]{73,74,75,71,69,72,76,73};
  a  =new int[]{89,62,70,58,47,47,46,76,100,70};
  a  =new int[]{89,62,70,58,47,47,46,76,100,70};
   System.out.println(Arrays.toString( dailyTemperatures(a)));

}
    public static int[] dailyTemperatures(int[] temperatures) {
    int[] values=new int[temperatures.length];
    Stack<Integer> stack =new Stack<>();
        for(int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]) values[stack.peek()] = i-stack.pop();
            stack.add(i);
        }
    return values;
    }


// failed approach
    public static int[] dailyTemperatures3(int[] temperatures) {
    int[] counts = new int[temperatures.length];
    Map<Integer,Integer> map =new HashMap<>();
    int max =temperatures[0];
    for(int i = 0; i < temperatures.length; i++) {
        map.put(temperatures[i],i);
        if (max<temperatures[i])max=temperatures[i];
    }
    for(int i = 0; i < temperatures.length-1; i++) {
        if (temperatures[i]<temperatures[i+1]) {counts[i]=1; continue;}
        int check=temperatures[i]+1;
        while ( check<=max){
            if (map.containsKey(check)){
                counts[i]=Math.abs(map.get(check)-i);
                break;
            }
            check++;
        }
        map.remove(temperatures[i]);
    }
    System.out.println(map);
    return counts;
    }


// this one gives tle
public static int[] dailyTemperatures2(int[] temperatures) {
    int[] duration =new  int[temperatures.length];
    for(int i = 0; i < temperatures.length-1; i++) {
        int count =1;
        int current=temperatures[i];
        int j=i+1;
        while (true){
            if (j>=temperatures.length) {
                count=0;
                break;
            }
            if (current>=temperatures[j]) count++;
            else break;
            j++;
        }
        j=0;
        duration[i]= count;
    }

    return duration;
    }
}

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args){
        int a[] ={4,1,-1,2,-1,2,3};
        System.out.println(Arrays.toString(topKFrequent(a,2)));
    }
//    public static int[] topKFrequent(int[] nums, int k) {
//        Map<Integer,Integer> map =new HashMap<>();
//        for (int i : nums){
//            if (!map.containsKey(i)) map.put(i,0);
//            map.put(i,map.get(i)+1);
//        }
//        System.out.println(map);
//        for(int i = 0; i < nums.length; i++) {
//            for(int j = i; j <nums.length-1 ; j++) {
//                if (map.get(nums[j])<map.get(nums[j+1])) {
//                    int temp =nums[j];
//                    nums[j]=nums[j+1];
//                    nums[j+1]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//        int[] res=new int[k];
//        for(int i = 0; i < k; i++) {
//            res[i]=(int)temp[i];
//        }
//    return res;
//    }

    //    public static int[] topKFrequent(int[] nums, int k) {
//        Map<Integer,Integer> map =new HashMap<>();
//        for (int i : nums){
//            if (!map.containsKey(i)) map.put(i,0);
//            map.put(i,map.get(i)+1);
//        }

        public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map =new HashMap<>();
        for (int i : nums){
            if (!map.containsKey(i)) map.put(i,0);
            map.put(i,map.get(i)+1);
        }
            PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a, b) -> -a.getValue() + b.getValue());
        for (Map.Entry<Integer, Integer> pair:map.entrySet()){
            queue.add(pair);
        }
        int [] num =new int[k];
        for(int i = 0; i < k; i++) {
            num[i]=queue.poll().getKey();
        }

        return num;
        }
    static class Pair implements Comparator<Pair> {
        int key;
        int freq;

        @Override
        public int compare(Pair o1, Pair o2) {
            return Integer.compare(o2.freq,o1.freq);
        }
    }
}

public class MaximumPointsYouCanObtainFromCards {
    public static void main(String[] args){
    System.out.println(maxScore(new int[]{1,2,3,4,5,6,1},3));
    }
    public static int maxScore(int[] cardPoints, int k) {
    int sum=0;
    int total=0;
    for (int i : cardPoints){
        total+=i;
    }
    int min=Integer.MAX_VALUE;
    int start=0;
    for(int end = 0; end < cardPoints.length; end++) {
        sum+=cardPoints[end];
        if (end-start+1==cardPoints.length-k){
            min=Math.min(sum,min);
            sum-=cardPoints[start++];
        }

    }
    return total-min;
    }
}

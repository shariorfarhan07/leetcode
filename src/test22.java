public class test22 {
    public static void main(String[] args){
      System.out.println(test());
    }
    public static int test(){
        try{
           return 1;
        }catch (Exception e){
            return 2;
        }finally{
            return 3;
        }

    }
}

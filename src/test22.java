public class test22 {
    public static void main(String[] args){
        test t=new test();

        try{
            System.out.println("try");
        }catch (Exception e){
            System.out.println("exception");
        }finally{
            System.out.println("finally");
            t.close();
        }
        System.out.println("end");
    }
    static class test{
        public void close(){
            System.out.println("close");
        }
    }
}

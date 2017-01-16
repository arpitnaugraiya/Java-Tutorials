/**
 * Created by arpit on 8/1/17.
 */
/*public class FinalExample {
    public static void main(String[] args){
        final int x = 25;


       //x = 20;
        System.out.println(x);
    }
}*/

class FinallyExample{
    public static void main(String[] args){
        try{
            int x= 300/0;
        }catch(Exception e){System.out.println(e);}

        finally{System.out.println("finally block is executed");}
    }
}

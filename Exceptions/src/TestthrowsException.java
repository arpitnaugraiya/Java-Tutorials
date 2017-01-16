/**
 * Created by arpit on 8/1/17.
 */
public class TestthrowsException {
    static void check() throws ArithmeticException{
       System.out.println("Inside check function");
        throw new ArithmeticException("demo");
    }

    public static void main(String args[]){
        try{
            check();
        }catch(ArithmeticException e){System.out.println("caught" + e);}
    }
}

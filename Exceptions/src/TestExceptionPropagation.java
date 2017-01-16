import java.io.IOException;

/**
 * Created by arpit on 7/1/17.
 */
public class TestExceptionPropagation {
    void m() throws IOException {
        int data=50/0;
        System.out.println("inside m!");
//        throw new java.io.IOException("device Error");//checked exception
    }
    void n() throws IOException {
        m();
        System.out.println("Inside n!");
    }

    void p(){
        try{
            n();
            System.out.println("Inside p!");
        }catch(Exception e){System.out.println("Exception handled!!");}
    }
    public static void main(String args[]){
        TestExceptionPropagation obj = new TestExceptionPropagation();
        obj.p();

        System.out.println("normal flow...");
    }
}

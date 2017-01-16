/**
 * Created by arpit on 7/1/17.
 */
public class Testthrow {
    static void validate(int age){
        if (age<18){
            throw new ArithmeticException("not valid!");
        }
        else
            System.out.println("Welcome to vote!");
    }

    public static void main(String []args){
        validate(10);
        System.out.println("Rest of the code!!!");
    }
}

/**
 * Created by arpit on 6/1/17.
 */
public class Testtrycatch {
    /*public static void main(String []args){
        try{
            int i = 5/0;
        }catch(ArithmeticException e)
            {System.out.println(e);}

        System.out.println("rest of the code...");
    }*/

    /*public static void main(String [] args){
        try{
            int arr[] = new int[5];
            arr[5] = 3/0;
        }
        catch (ArithmeticException e){System.out.println("task 1 completed!");}
        catch (IndexOutOfBoundsException e){System.out.println("task 2 completed!");}
        catch (Exception e){System.out.println("normal task completed!");}


        System.out.println("rest of the code...");
    }*/

    public static void main(String args[]){
        try{
            try{
                int b = 5/0;
            }catch(ArithmeticException e){System.out.println(e);}
            try{
                int arr[]= new int[5];
                arr[6] = 30;
            }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
        }catch(Exception e){System.out.println(e);}

        finally{
            System.out.println("Inside finally block!!");
        }

        System.out.println("rest of the code...");
    }


}

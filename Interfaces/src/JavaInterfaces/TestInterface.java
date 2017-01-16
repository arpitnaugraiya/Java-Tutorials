package JavaInterfaces;

/**
 * Created by arpit on 10/1/17.
 */
public class TestInterface {

    public static void main(String []args){
        RectanglePlus rp1 = new RectanglePlus(10,20);
        RectanglePlus rp2 = new RectanglePlus(10,15);

        System.out.println(rp1.isLargerThan(rp2));
    }
}

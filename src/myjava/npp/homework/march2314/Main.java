package myjava.npp.homework.march2314;

/**
 * Created by Sabishinzou on 27.03.14.
 */
public class Main {
    public static void main(String[] args){
        System.out.print("Begin\n");
        Complex c1 = new Complex(1,1);
        System.out.println(c1);

        Complex c2 = new Complex(3,-4);
        System.out.println(c2);
        Complex c3 = new Complex(1,1);
        System.out.println(c3);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));

        System.out.println(c1.getModule());
        System.out.println(c1.getArg());
        System.out.println(c2.getModule());
        System.out.println(c2.getArg());

        c1.conjugate();
        c2.conjugate();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println();

        c1.sum(c2);
        System.out.println(c1);
        c1.difference(c2);
        System.out.println(c1);
        c1.productOnNumber(5);
        System.out.println(c1);
    }
}

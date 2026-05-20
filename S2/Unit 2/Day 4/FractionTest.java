//Your Name
//This is the test file for the function class

public class FractionTest{
    public static void main(String[] biggie){
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(3,8);

        System.out.println(f1);
        System.out.println(f2);

        f1.setFraction(1,2);
        f2.setFraction(3, 4);

        System.out.println(f1);
        System.out.println(f2);

        f1.setFraction();
        f2.setFraction();

        System.out.println(f1);
        System.out.println(f2);

    }
}
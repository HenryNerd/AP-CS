public class Fraction{
    private int numerator;
    private int denominator;

    private static int randint(){
        int newNum = (int)(Math.random()*100+1);

        return(newNum);
    }

    public Fraction(){
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int num, int den){
        numerator = num;
        denominator = den;
    }

    @Override
    public String toString(){
        return(numerator+"/"+denominator);
    }

    public void setFraction(int num, int dem){
        numerator = num;
        denominator = dem;
    }

    public void setFraction(){
        denominator = randint();
        numerator = randint();
    }

    
}
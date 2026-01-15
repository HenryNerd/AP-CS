public class forLoops{
    public static void print(String print){
        System.out.println(print);
    }
    public static void main(String[] andersonMusket){
        int count = 0;
        while(count < 5){
            System.out.println(count);
            count = count + 1;
        }
        for(int counter = 0; counter <5; counter=counter+1){
            print(counter);
        }
    }
}
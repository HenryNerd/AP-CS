public class StringsBOI {
    public static void print(String input){
        System.out.println(input);
    }
    public static void main(String[] args){
        String word = "anders is gay";
        for(int i = 0; i < word.length(); i++){
            if(i % 2 == 0){
                print(Character.toString(word.charAt(i)));
            }
        }
    }
}
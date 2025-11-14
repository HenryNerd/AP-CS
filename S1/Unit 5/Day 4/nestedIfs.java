import javax.swing.*;

public static class nestedIfs{

        public static int getNum(String prompt){//Start Get Num
        String unparsedInput = JOptionPane.showInputDialog(null, prompt);
        int parsedInput;
        try {
            parsedInput = Integer.parseInt(unparsedInput);
        } catch (Exception e) {
            parsedInput = 0;
            JOptionPane.showMessageDialog(null, "Error - Input Not Allowed");
        }
        return(parsedInput);
    } //End Get Num
    
    public static void main(String[] andersonMusket){

    }
}
import javax.swing.JOptionPane;

/*
Henry Veedahl

This is just me plating around
*/


public class testing{// Start Of Program
    public static void main(String[] args){//Start of Main
        double temp;
        double original;
        temp = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the current temp"));
        original = temp;
        temp = temp * 1.8;
        temp = temp + 32;
        JOptionPane.showMessageDialog(null, original+"°F is "+temp+"°C");

    }//End of Main
}//End of Program
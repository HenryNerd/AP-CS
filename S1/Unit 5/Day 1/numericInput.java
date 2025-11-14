/*
Henry Veedahl

Numeric Inputs
*/

import javax.swing.*;

public class numericInput {//Start Class

    public static void main(String[] beans) {//Start main
    String name;
    int hours = 0;
    double wage;

    final double TAX = 0.004;

    name = JOptionPane.showInputDialog(null, "Enter Your Name");

    String input = null;

    input = JOptionPane.showInputDialog(null, "Work Hours this year");
    
    try{
    hours = Integer.parseInt(input);
    }catch(Exception e){
        hours = 0;
    }

    input = JOptionPane.showInputDialog(null, "Wage Per Hour");

    try {
        wage = Double.parseDouble(input);
    } catch (Exception e) {
        wage = 0;
    }

    double total = hours * wage;
    double deduction = total * TAX;
    double takeHomePay = total - deduction;

    JOptionPane.showMessageDialog(null, "Your Hours This Year: "+hours+"\n Your Wage: "+wage+"\n \nYour Total Pay: "+total+"\n Your Deduction: "+deduction+"\n Your Take Home Pay: "+takeHomePay);
    }//End of main

}//End Class
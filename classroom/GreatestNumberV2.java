/*********************
emmanuel antelmo gonzalez cortes
GreatestNumber.java
This program finds the greatest of three numbers
************************/
import javax.swing.JOptionPane;

public class GreatestNumberV2{
  public static void main(String[]args){
    double numberOne, numberTwo, numberThree;

    numberOne = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number "));//30
    numberTwo = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number "));//10
    numberThree = Double.parseDouble(JOptionPane.showInputDialog("Enter the third number "));//80

    if (numberOne > numberTwo && numberOne > numberThree) {
      JOptionPane.showMessageDialog(null,"The greatest number is "+numberOne);
    } else if(numberTwo > numberOne && numberTwo > numberThree){
      JOptionPane.showMessageDialog(null,"The greatest number is "+ numberTwo);
    } else if(numberThree > numberOne && numberThree > numberTwo){
      JOptionPane.showMessageDialog(null,"The greatest number is "+ numberThree);
    } else{
      JOptionPane.showMessageDialog(null,"Enter the correct number ");
    }//end if
  }//end main
}//end GreatestNumber

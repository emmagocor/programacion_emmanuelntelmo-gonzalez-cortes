/*********************
Ernesto Macin Morales

GreatestNumber.java
This program finds the greatest of three numbers
************************/
import javax.swing.JOptionPane;

public class GreatestNumber{
  public static void main(String[]args){
    double numberOne, numberTwo, numberThree;

    numberOne = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number "));//30
    numberTwo = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number "));//10
    numberThree = Double.parseDouble(JOptionPane.showInputDialog("Enter the third number "));//80

    if (numberOne > numberTwo) {
      if (numberOne > numberThree) {
        JOptionPane.showMessageDialog(null, "The greatest number is first "+numberOne);
      }//end if
    }//end if
    if (numberTwo > numberOne) {
      if (numberTwo > numberThree) {
        JOptionPane.showMessageDialog(null,"The gratest number is second "+numberTwo);
      }//end if
    }//end if
    if (numberThree > numberOne) {
      if (numberThree > numberTwo) {
        JOptionPane.showMessageDialog(null,"The greatest number is third "+numberThree);
      }//end if
    }//end if
  }//end main
}//end GreatestNumber

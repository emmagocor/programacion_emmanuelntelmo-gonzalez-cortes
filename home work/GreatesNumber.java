/********
*emmanuel antelmo gonzalez cortes 
*GreatesNumber.java
*this program finds the greates of three numbers
**********/
import javax.swing.JOptionPane;
public class GreatesNumber{
  public static void main(String[] args){
    double numberOne, numberTwo, numThree;
    numberOne = Double.parseDouble(JOptionPane.showInputDialog("enter a first number"));
    numberTwo = Double.parseDouble(JOptionPane.showInputDialog("enter a secund number"));
    numThree = Double.parseDouble(JOptionPane.showInputDialog("enter a third number"));
    if (numberOne > numberTwo && numberOne>numThree) {
      JOptionPane.showMessageDialog(null,"the greates number is "+numberOne);

    }
    if (numberTwo > numberOne && numberTwo>numThree) {
      JOptionPane.showMessageDialog(null,"the greates number is "+numberTwo);

    }
    if (numThree > numberOne && numThree>numberTwo) {
      JOptionPane.showMessageDialog(null,"the greates number is "+numThree);
    }
    if (numberOne == numberTwo && numberTwo == numThree) {
    JOptionPane.showMessageDialog(null,"the numbers entered are the same");
    }
  }//end main
}//end class

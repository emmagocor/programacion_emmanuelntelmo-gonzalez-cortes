/***************
emmanuel gonzalez cortes

FactorialForLoop.java
This program prints the factorial of a number
*******************************************/
import javax.swing.JOptionPane;
public class FactorialForLoop{
  public static void main(String[]args){
    double factorial = 1, number;

    number = Double.parseDouble(JOptionPane.showInputDialog("Enter the number"));

    for (int i=1;i <= number ; i++ ) {
      factorial *= i;
    }//end for
    JOptionPane.showMessageDialog(null,"The factorial is "+factorial," factorial ",JOptionPane.OK_OPTION);
  }//end main
}//end the program

/***************************
Ernesto Macin Morales
This program prints if a number is possitive or negative
****************************/
import javax.swing.JOptionPane;

public class NegativePositive{
  public static void main(String[]args){
    double number;

    number = Double.parseDouble(JOptionPane.showInputDialog("Enter a number"));

    if (number > 0) {
      JOptionPane.showMessageDialog(null, "your number is positive");

    }else{
      JOptionPane.showMessageDialog(null,"Your number is negative");
    }

  }
}

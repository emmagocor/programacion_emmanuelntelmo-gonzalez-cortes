/*************
*Diego Perez
*PossitiveOrNegative.java
*this program prints if a number is positive or negative
*************/
import javax.swing.JOptionPane;


public class PossitiveOrNegative{
public static void main(String[] args){
  double number;
  number  = Double.parseDouble(JOptionPane.showInputDialog("enter a number"));
  if (number != 0) {
    if (number>0) {
      JOptionPane.showMessageDialog(null,"your number is positive");
    }else {
      JOptionPane.showMessageDialog(null,"your number is negative");
    }
   }
  if (number == 0) {
    JOptionPane.showMessageDialog(null,"your number is 0");
  }
 }//end main
}//end class

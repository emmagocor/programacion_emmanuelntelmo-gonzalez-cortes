/*****
*emmanuel antelmo gonzalez cortes 
*PaymentCalculator.java
*this program calculates the amount to be paid for the products
*****/
import javax.swing.JOptionPane;
public class PaymentCalculator{
  public static void main(String[] args){
    final double OriginCost=0.90;
    final double DiscountCost=0.85;
    int quantity;
    double payment;
    quantity = Integer.parseInt(JOptionPane.showInputDialog("enter the amount purchased"));
    if (quantity>1000) {
      payment=quantity*DiscountCost;
    }else {
      payment=quantity*OriginCost;
    }
    JOptionPane.showMessageDialog(null,"The total to be paid for the products will be: $"+payment);
  }
}

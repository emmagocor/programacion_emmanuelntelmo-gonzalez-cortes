/********************************
emmanuel antelmo gonzalez cortes
PrintPurchaseOrderGui.java
This program calculates and prints a purchase order report
********************************///
import javax.swing.JOptionPane;

public class PrintPurchaseOrderGui{
  public static void main(String[]args){
    String itemName;
    double price;
    int quantity;

    itemName= JOptionPane.showInputDialog("Enter the name of purchase item ");
    price= Double.parseDouble(JOptionPane.showInputDialog("Enter price of one item"));
    quantity=
    Integer.parseInt(JOptionPane.showInputDialog("Enter quantity"));

    JOptionPane.showMessageDialog(null, "PURCHASE ORDER: \n\n"+" Item:"+itemName+"\nprice "+price+"\nQuantity: "+quantity+"\nTotal $ "+price*quantity );
  }//end main
}// end class PrintPurchaseOrderGui

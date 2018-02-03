/*******
emmanuel gonzalez

PrintPurchaseOrderGui.Java
This program calculates and prints a purchase order report
***/
import javax.swing.jOptionPane;
public class PrintPurchaseOrderGui{
  public static void main (String[] args){
    String itemName; // name of purchase item
    Double price; //number of  purchase item
    int quantity; //number of items purchase
    itemName = JOptionPane.showInputDialog("Enter name of purchase item");
    price =  Double.parseDouble(JOptionPane.showInputDialog ("Enter price of one item"));
  quantity= pasrseInt(JOptioPane.showInputDialog("Enter quantity"));
  JOptionPane.showMessageDialog(null,"purchase order:\n\n "+"item"+itemname+" \n price"+price+"\nQuantity:"+Quantity+"\ntotal$"+price*quantity);

  }//end main
}//end class PrintPurchaseOrderGui

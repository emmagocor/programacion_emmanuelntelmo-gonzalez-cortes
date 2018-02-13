/*********
*emmanuel antelmo gonzalez cortes
*SalesProfits.java
*this prgram calculates the sales profits to the producer of grapes
*********/
import javax.swing.JOptionPane;
public class SalesProfits{
  public static void main(String[] args){
    String kind;
    int size=0;
    double price=0;
    double earnings=0;
    double kilosOfProduction=0;
    price=Double.parseDouble(JOptionPane.showInputDialog(null,"enter the price per kilo of grapes"));
    kilosOfProduction=Double.parseDouble(JOptionPane.showInputDialog(null,"enter the kilos of grapes produced"));
    kind=JOptionPane.showInputDialog(null,"enter the kind (A or B).");
    switch (kind) {
      case "A":
      size=Integer.parseInt(JOptionPane.showInputDialog(null,"enter size of the grapes"));
        if (size==1) {
          earnings=(price+0.20)*kilosOfProduction;//"0.20" is the value that adds to the price of the kilo of grapes for the size
        }else if (size==2) {
        earnings=(price+0.30)*kilosOfProduction;//"0.30" is the value that adds to the price of the kilo of grapes for the size
      }else {
        JOptionPane.showMessageDialog(null,"wrong size entered");
      }
        break;
        case "B":
        size=Integer.parseInt(JOptionPane.showInputDialog(null,"enter size of the grapes"));
          if (size==1) {
            earnings=(price-0.30)*kilosOfProduction;//"0.30" is the value that subtracted to the price of the kilo of grapes for the size
          }else if (size==2) {
          earnings=(price-0.50)*kilosOfProduction;//"0.50" is the value that subtracted to the price of the kilo of grapes for the size
        }else {
          JOptionPane.showMessageDialog(null,"wrong size entered");
        }
          break;
      default:JOptionPane.showMessageDialog(null,"wrong kind entered");

    }
    JOptionPane.showMessageDialog(null,"The earnings obtained will be $"+earnings);
  }
}

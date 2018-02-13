/**********************
emmanuel antelmo gonzalez cortes 

WhileLoop.java
This program makes entries in a bridal registry
**********************/
import javax.swing.JOptionPane;
public class WhileLoop{
  public static void  main(String[]args){
    String registry = "";
    char more;
    String mad;
    more = JOptionPane.showInputDialog("Do you want to create a bridal registry?  (y/n)").charAt(0);

    while(more == 'y' || more == 'Y'){
      registry +=JOptionPane.showInputDialog("Enter the item: ");
      registry += JOptionPane.showInputDialog("Enter store \n" );
      registry += "\n";
      more = JOptionPane.showInputDialog("Any more items? (y/n) ").charAt(0);
      }//end while
      if (!registry.equals("")) {

        JOptionPane.showMessageDialog(null,"\n Bridal registry\n "+registry);
      }//end if
  }
}

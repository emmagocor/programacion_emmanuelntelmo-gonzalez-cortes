/************************
emmanuel  antelmo gonzalez cortes

FloorSpaceDowhile.java
This program calculate total floor space in a house.
*************************/
import javax.swing.JOptionPane;
public class FloorSpaceDoWhile{
  public static void main(String[]args){
      double length, width;// room dimensions
      double floorSpace = 0;// house's total floor
      char response;// user's response

      do{

        length = Double.parseDouble(JOptionPane.showInputDialog("Enter the room's length"));
        width = Double.parseDouble(JOptionPane.showInputDialog("Enter the room's width"));
        floorSpace += length * width;
        response = JOptionPane.showInputDialog("Any more room?? (y/n)").charAt(0);
      }while (response == 'y' || response == 'Y');
      JOptionPane.showMessageDialog(null,"The total floor space is "+floorSpace , "PELIGROOOOOOOOOOO!!!!!!!!!!!",JOptionPane.WARNING_MESSAGE);
  }
}

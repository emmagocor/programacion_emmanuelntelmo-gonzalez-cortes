/**************************
emmanuel antelmo gonzalez cortes

IfControlStatement.java
This program checks for period at the end of line
*************************************////
import javax.swing.JOptionPane;

public class IfControlStatement{
  public static void main(String[]args){
    String sentence;
    int lastCharPosition;

    sentence=JOptionPane.showInputDialog("Enter your sentence");
    //hola mundo.
    lastCharPosition=sentence.length() -1;

    if (sentence.charAt(lastCharPosition) != '.') {
      JOptionPane.showMessageDialog(null, "INvalid entry- your sentence needs a period");
    }//end if
  }//end main
}//end class

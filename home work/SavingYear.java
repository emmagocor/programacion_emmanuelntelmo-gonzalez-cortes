/**********
*emmanuel antelmo gonzalez cortes 
*SavingYear.java
*this program calculates a person's savings in a year
**********/
import javax.swing.JOptionPane;
public class SavingYear{
  public static void main(String[] args){
    int month=1;
    char more;
    double savingYear=0;
    double savingofthemonth=0;
    /*savingYear=Double.parseDouble(JOptionPane.showInputDialog("enter the customer's current savings"));
    while (month<12) {
      savingofthemonth = Double.parseDouble(JOptionPane.showInputDialog("enter a saving of the month"));
      savingYear=savingYear+savingofthemonth;
      year++;
    }
    JOptionPane.showMessageDialog(null,"The client's current savings is"+savingYear+" in "+month);*/
    do {
      savingofthemonth=Double.parseDouble(JOptionPane.showInputDialog("enter a saving of the month "+month));
      month ++;
      savingYear=savingYear+savingofthemonth;
      more=JOptionPane.showInputDialog("any more? saving (y/n)").charAt(0);
    } while (more=='y');
    JOptionPane.showMessageDialog(null,"the saving of the year is: \n"+savingYear+" in "+month+" months"+"\n the last savings was from "+savingofthemonth,"DATES OF THE SAVINGS",JOptionPane.QUESTION_MESSAGE);
  }
}

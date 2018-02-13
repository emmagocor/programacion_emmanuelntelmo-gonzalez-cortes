/**********
*emmanuel antelmo gonzalez cortes
*CalculatorOfTheSalary.java
*this program calculate the salary of the employee
**********/
import javax.swing.JOptionPane;
public class CalculatorOfTheSalary{
  public static void main(String[] args){
    int days=0;
    double hours;
    double hourstotal=0;
    double salarytotal=0;
    double salaryforhour=0;
    char desicion;
    salaryforhour=Double.parseDouble(JOptionPane.showInputDialog("enter the hourly wage of the employee"));
    do {
      hours=Double.parseDouble(JOptionPane.showInputDialog("hours worked in day?"));
      hourstotal=hours+hourstotal;
      days ++;
      desicion = JOptionPane.showInputDialog("any more day?").charAt(0);
    } while (desicion =='y');
    salarytotal=salaryforhour*hourstotal;
    JOptionPane.showMessageDialog(null,"the employee has worked \n"+hourstotal+" total hours"+"\n hourly wage "+salaryforhour+"\nthe salary that the employee will have will be "+salarytotal+"\n in "+days+" days","Calculator Of The Salary",JOptionPane.INFORMATION_MESSAGE);
  }
}

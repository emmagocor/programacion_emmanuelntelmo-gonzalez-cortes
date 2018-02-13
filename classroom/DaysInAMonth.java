/**********************
Ernesto Macin Morales
DaysInAMonth.java

This program finds the number of days in a month
*************************/
import javax.swing.JOptionPane;

public class DaysInAMonth{
  public static void main(String[]args){
    int numberOfDaysInAMonth = 0;
    String monthOfYear;

    monthOfYear = JOptionPane.showInputDialog("Enter your month ");

    switch(monthOfYear){
      case "january":
      numberOfDaysInAMonth = 31;
      break;
      case "February":
      numberOfDaysInAMonth = 28;
    }
  }//end main
}//end .java

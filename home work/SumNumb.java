/*******
*emmanuel antelmo gonzalez cortes 
*SumNumb.java
*this program performs the sum  numbers entered by the user
********/

import javax.swing.JOptionPane;
public class SumNumb{
public static void main(String[] args){
double number=0;
int counter=0;
double totalsum=0;
int quantitiOfNumbers=0;
 quantitiOfNumbers= Integer.parseInt(JOptionPane.showInputDialog("enter the quantiti numbers "));
while (counter<quantitiOfNumbers) {
  number = Double.parseDouble(JOptionPane.showInputDialog("enter a number"));
  totalsum=number+totalsum;
  counter ++;
}
JOptionPane.showMessageDialog(null,"the sum of "+quantitiOfNumbers+" the numbers is ="+totalsum);
 }
}

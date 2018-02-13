/********
*emmanuel antelmo gonzalez cortes
*Sorter.java
*this program calculate the quantity of number positives, negatives or zero
*******/
import javax.swing.JOptionPane;
public class Sorter{
public static void main(String[] args){
int quantity=0;
double number;
int positives=0, negatives=0,zero=0,counter=0;
char decision;
do {
  number=Double.parseDouble(JOptionPane.showInputDialog("enter a number"));
  counter ++;
  if (number>0) {
    positives++;
  }else if (number<0) {
    negatives++;
  }else if (number==0) {
    zero++;
  }
  decision=JOptionPane.showInputDialog("any more?(y/n)").charAt(0);
} while (decision=='y');
JOptionPane.showMessageDialog(null,"quantity of the numbers is: \n"+quantity+"\n quantity of the numbers positives:\n"+positives+"\n quantity of the numbers negatives: \n"+negatives+"\n quantity of the numbers equal to zero \n"+zero,"stats",JOptionPane.QUESTION_MESSAGE);
 }
}

/************
*emmanuel antelmo gonzalez cortes 
* AverageAge.java
*his program calculates the average height of a group of people, whose number of members is unknown
************/
import javax.swing.JOptionPane;
public class AverageAge {
public static void main(String[] args){
double height;
double averageheight=0;
int counter=0;
double sumheight;
char decision;
do {
  height=Double.parseDouble(JOptionPane.showInputDialog("enter a height"));
  averageheight=averageheight+height;
decision = JOptionPane.showInputDialog("any more? (y/n)").charAt(0);
counter ++;
} while (decision=='y');
 JOptionPane.showMessageDialog(null,"the average height of the "+counter+" people is: \n"+averageheight,"calculator of the height",JOptionPane.INFORMATION_MESSAGE);
 }
}

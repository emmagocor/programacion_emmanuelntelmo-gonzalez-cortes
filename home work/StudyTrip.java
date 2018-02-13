/************
*emmanuel antelmo gonzalez cortes
*StudyTrip.java
*this program calculates the student's payment for the study trip
************/
import javax.swing.JOptionPane;
public class StudyTrip{
  public static void main(String[] args){
    int numberOfStudents=0;
    double paymentOfStudent=0;
    double paymentTotal=0;
    numberOfStudents = Integer.parseInt(JOptionPane.showInputDialog(null,"enter the number of the studens"));
    if (numberOfStudents>100)/*"100" is the limit for the ticket per student */ {
      paymentOfStudent=65;
      paymentTotal=numberOfStudents*paymentOfStudent;
    }else if (numberOfStudents>49) /*"49" is the limit for the ticket per student */ {
      paymentOfStudent=70;
        paymentTotal=numberOfStudents*paymentOfStudent;
    }else if (numberOfStudents>30) /*"30" is the limit for the ticket per student */ {
      paymentOfStudent=95;
        paymentTotal=numberOfStudents*paymentOfStudent;
    }else if (numberOfStudents<31) {
        paymentTotal=4000;//"4000"is the price of the Study Trip
        paymentOfStudent=paymentTotal/numberOfStudents;
    }
    JOptionPane.showMessageDialog(null,"cooperation per student will be $"+paymentOfStudent+"\n\nThe total to be paid to the travel company will be $"+paymentTotal);
  }//end main
}//end class

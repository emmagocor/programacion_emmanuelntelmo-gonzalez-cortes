/*********
*emmanuel antelmo gonzalez cortes
*QueryNumber.java
*this program calculates the price of the appointment depending on the number that is the same
*********/
import javax.swing.JOptionPane;
public class QueryNumber{
  public static void main(String[] args){
    int queryNumber;
    double queryprice=0;
    double paymentTotal=0;
    queryNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"enter inquiry number that is"));
    if (queryNumber>3) {
        if (queryNumber>6) {
          if (queryNumber>9) {
              queryprice=50;
                paymentTotal=((queryNumber-8)*queryprice)+1200;//The first three appointments at $ 200.00 each, The next two appointments at $ 150.00 each, The next three appointments at $ 100.00 each, The rest at $ 50.00 each, for the duration of the treatment.
          }else {
            queryprice=100;
              paymentTotal=((queryNumber-5)*queryprice)+900;//The first three appointments at $ 200.00 each, The next two appointments at $ 150.00 each, The next three appointments at $ 100.00 each.
          }
          }else {
            queryprice=150;
            paymentTotal=((queryNumber-3)*queryprice)+600;  //The first three appointments at $ 200.00 each, The next two appointments at $ 150.00 each.
          }
        }else {
      queryprice=200;//The first three appointments at $ 200.00 each
      paymentTotal=queryprice*queryNumber;
    }//end else
    JOptionPane.showMessageDialog(null,"the patient will pay by appointment: $"+queryprice+"\nthe patient has paid for the entire treatment: $"+paymentTotal);
  }//end main
}//end class

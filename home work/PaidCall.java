/*********
*emmanuel antelmo gonzalez cortes 
*PaidCall.java
*this program calculates the user's payment for a call
*********/
import javax.swing.JOptionPane;

public class PaidCall{
  public static void main(String[] args){
    double time;
    String schedule;
    String turn;
    double priceForTime;
    double tax;
    double paymentTotal=0;
    time=Double.parseDouble(JOptionPane.showInputDialog(null,"enter to time of the call in minutes"));
    if (time>5) {
      if (time>8) {
        if (time>10) {
          priceForTime=((((time-10)*0.50)+1.4)+2.4)+5;//the first five minutes cost $ 1.00 each, the next three minutes, 80 ¢ each, the next two minutes, 70 ¢ each, and from the tenth minute, 50 ¢ each.
        }else {
          priceForTime=(((time-8)*0.70)+2.4)+5;//the first five minutes cost $ 1.00 each, the next three minutes, 80 ¢ each, the next two minutes, 70 ¢ each
        }
      }else {
        priceForTime=((time-5)*0.80)+5;//the first five minutes cost $ 1.00 each, the next three minutes, 80 ¢ each
      }
    }else {
      priceForTime=time*1;//he first five minutes cost $ 1.00 each
    }
    schedule = JOptionPane.showInputDialog(null,"enter the current day (Weekday or Sunday)(*capitalized the first letter*)");
    switch (schedule) {
      case "Weekday"://if it is a working day, in the morning shift, 15%, and in the afternoon shift, 10%.
              turn = JOptionPane.showInputDialog(null,"unter the turn of the call(Evening or Morning)(*capitalized the first letter*)");
              switch (turn) {
                case "Morning":
                    tax=((priceForTime/100)*15);
                    paymentTotal=priceForTime+tax;
                break;
                case "Evening":
                    tax=((priceForTime/100)*10);
                    paymentTotal=priceForTime+tax;
                    break;
                default:JOptionPane.showMessageDialog(null,"bad turn");
                  }
      break;
      case "Sunday":
        tax=((priceForTime/100)*3);//a 3% tax is charged when it is Sunday
        paymentTotal=priceForTime+tax;
        break;
      default:
        JOptionPane.showMessageDialog(null,"bad day");
    }//end switch
    JOptionPane.showMessageDialog(null,"nwith a time of: "+time+" minutes"+"\nOn a schedule: "+schedule+"\nthe call will have total cost: $"+paymentTotal);
  }//end main
}//end class

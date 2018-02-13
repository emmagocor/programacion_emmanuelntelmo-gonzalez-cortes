/**********
*emmanuel antelmo gonzalez cortes
*UnknownTown.java
*this program calculate the increase of credit card
**********/
import javax.swing.JOptionPane;
public class UnknownTown{
  public static void main(String[] args){
    int typeOfCard;
    double currentLimit;
    double creditIncrease;
    double newCreditLimit;
    currentLimit=Double.parseDouble(JOptionPane.showInputDialog(null,"enter current Limit of the credit card"));
    typeOfCard=Integer.parseInt(JOptionPane.showInputDialog(null,"enter the type of the card(1,2,3,...)"));
    if (typeOfCard==1) {
      creditIncrease=(currentLimit/100)*25;//type 1, the increase will be 25%
      newCreditLimit=creditIncrease+currentLimit;
    }else if (typeOfCard==2) {
      creditIncrease=(currentLimit/100)*35;//; if you have type 2, it will be 35%
      newCreditLimit=creditIncrease+currentLimit;
    }else if (typeOfCard==3) {
      creditIncrease=(currentLimit/100)*40;//; if it has type 3, of 40%
      newCreditLimit=creditIncrease+currentLimit;
    }else {
      creditIncrease=(currentLimit/100)*50;//, and for any other type, of 50%
      newCreditLimit=creditIncrease+currentLimit;
    }
  JOptionPane.showMessageDialog(null,"type of card "+typeOfCard+"\ncurrent limit "+currentLimit+"\ncredit increase "+creditIncrease+"\nnew credit limit "+newCreditLimit);
  }
}

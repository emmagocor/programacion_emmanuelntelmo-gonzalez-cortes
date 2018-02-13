/**********
*emmanuel antelmo gonzalez cortes 
*FoodBanquet.java
*this program calculate the price of the food banquet
**********/
import javax.swing.JOptionPane;
public class FoodBanquet{
  public static void main(String[] args){
    int numPersons;
    double priceFoodBanquet=0;
    double priceOfTheSaucer=0;
    JOptionPane.showMessageDialog(null,"the saucer price per person is $95.00");
    numPersons=Integer.parseInt(JOptionPane.showInputDialog("enter the number of the persons"));
    if (numPersons<200) {
      priceOfTheSaucer=95;
      priceFoodBanquet=numPersons*priceOfTheSaucer;
    }else if (numPersons<300) {
      priceOfTheSaucer=85;
      priceFoodBanquet=numPersons*priceOfTheSaucer;
    }else if (numPersons>300) {
      priceOfTheSaucer=75;
      priceFoodBanquet=numPersons*priceOfTheSaucer;
    }
    JOptionPane.showMessageDialog(null,"the banquet will have the price of $"+priceFoodBanquet);
  }
}

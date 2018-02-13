/******************
emmanuel antelmo gonzalez cortes

BMI.java
This program calculates the body Mass Index
*********************************/
import javax.swing.JOptionPane;
  public class BMI{
    public static void main(String[]args){
      float weight, height;
      final double KILOGRAMS_PER_POUND= 0.45359237;
      final double METERS_PER_INCHES=0.0254;

      weight = Float.parseFloat(JOptionPane.showInputDialog("Enter your weight in prounds"));
      height = Float.parseFloat(JOptionPane.showInputDialog("Enter your height in inches"));

      double weightInKilograms = weight * KILOGRAMS_PER_POUND;
      double heightInMeters = height * METERS_PER_INCHES;

      double bmi = weightInKilograms / (Math.pow(heightInMeters,2));
      if (bmi < 16) {
        JOptionPane.showMessageDialog(null,"You are seriously underweight");
      }else if (bmi < 18) {
        JOptionPane.showMessageDialog(null,"Your are underweight");
      }else if (bmi < 24) {
        JOptionPane.showMessageDialog(null,"You are normal weight ");
      }else if (bmi < 29) {
        JOptionPane.showMessageDialog(null,"Your are over weight ");
      }else if (bmi < 35) {
        JOptionPane.showMessageDialog(null,"You are seriously Overweight");
      }else {
        JOptionPane.showMessageDialog(null,"You are gravely Overweight");
      }//end if
    }//end main
  }//end BMI.java

/*************************************
emmanuel antelmo gonzalez cortes
InputData.java

This program displays a personalized Hello greeting
****************************************/

import java.util.Scanner;

public class InputData{
  public static void main(String[]args){
  System.out.println("Enter your name");
  Scanner userData = new Scanner (System.in);
  String name;
  name= userData.nextLine();

  System.out.println("Hello "+name);
 }// end main
}//end InputData

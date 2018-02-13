/*****************************
emmanuel  antelmo gonzalez cortes

PrintPurchaseOrder.java
This program is claculates and prints a purchase
order amount
********************************/

import java.util.Scanner;

 public class PrintPurchaseOrder{
   public static void main(String[]args){
     Scanner D = new Scanner (System.in);
    double price;
    int quantity;
    double total;
    String name;

    System.out.println("Enter the name of the product");
    name= D.nextLine();
    System.out.println("Enter the price");
    price= D.nextDouble();
    System.out.println("Enter the quantity");
    quantity= D.nextInt();

    total=(price*quantity);
    System.out.println("Total purchase order $"+total + "  " + name);

  }
}

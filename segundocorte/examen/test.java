import javax.swing.*;
public class test
{
  public static void main(String[] args)
  {

   String palabra="amarrillo";
   String color=palabra.toUpperCase();
   System.out.println(color);
   switch(color)
  {
    case "NEGRO":
    System.out.println("correcto");
    break;
    case "ROJO":
    System.out.println("correcto");
    break;
    case "AZUL":
    System.out.println("correcto");
    break;
    case "BLANCO":
    System.out.println("correcto");
    break;
    case "GRIS":
    System.out.println("correcto");
    break;
    default:
    System.out.println("error");
    System.out.println(color="blanco");
    break;
  }

  }
}

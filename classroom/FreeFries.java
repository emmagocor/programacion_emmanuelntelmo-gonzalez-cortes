/*********************************
emmanuel antelmo gonzalez cortes

FreeFries
This program reads scored by home team
and the oppossing team and determinates if the fans
 free french fries
 ************************///
import javax.swing.JOptionPane;//para utilizar modo grafico GUI

 public class FreeFries{
   public static void main(String[]args){
     int homePoints;//points scored by home team
     int opponentPoints;//points scored by oppossing team

     homePoints= Integer.parseInt(JOptionPane.showInputDialog("Enter home points"));
     opponentPoints= Integer.parseInt(JOptionPane.showInputDialog("Enter oponnet points" ));

     if (homePoints > opponentPoints && homePoints >= 100){
       JOptionPane.showMessageDialog(null, "A free order of french fries for white tigers fans");
     }
   }
 }

/*
Examen 2ª
Lavadora.java
Emmanuel antelmo gonzalez cortes
*/
import javax.swing.*;
public class Lavadora extends Electrodomestico
{
  private int carga=5;
  public Lavadora()
  {
  }
  public Lavadora(int precioBase, int peso)
  {
    super (precioBase, peso);
  }
  public Lavadora(int carga, int precioBase, int peso, String color, char consumoEnergetico)
  {
    super(precioBase,peso,color,consumoEnergetico);
    this.carga=carga;
  }
  public int getCarga()
  {
    return this.carga;
  }

  public double precioFinal()
  {
    double precioLava=super.precioFinal();
    if (carga>30)
    {
      precioLava=precioLava+50;
    }
    return precioLava;
  }
}

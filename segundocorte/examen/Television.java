/*
Examen 2ª
Television.java
Emmanuel   antelmo gonzalez cortes
*/
import javax.swing.*;
public class Television extends Electrodomestico
{
  private int resolucion=20;
  private Boolean sintonizadorTDT=false;
  public Television()
  {
  }
  public Television(int precioBase, int peso)
  {
    super(precioBase, peso);
  }
  public Television(int resolucion, Boolean sintonizadorTDT, int precioBase, int peso, String color, char consumoEnergetico)
  {
    super(precioBase, peso, color, consumoEnergetico);
    this.resolucion=resolucion;
    this.sintonizadorTDT=sintonizadorTDT;
  }
  public int getResolucion()
  {
    return this.resolucion;
  }
  public Boolean sintonizadorTDT()
  {
    return this.sintonizadorTDT;
  }
  public double precioFinal()
  {
    double precioTele=super.precioFinal();
    if (resolucion>=40 )
    {
    precioTele=precioTele*1.30;
    }
    if (sintonizadorTDT==true)
    {
      precioTele=precioTele+50;
    }
    return precioTele;
  }

}

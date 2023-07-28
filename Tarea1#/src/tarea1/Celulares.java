
package tarea1;

import java.awt.Color;
import java.util.Date;


public class Celulares {
    public String Marca;
    public String Modelo;
    public double Precio;
    public Color color;
    public Date FechaC;
    public Date FechaV;
    public String Operador;

    public Celulares() {
    }

    public Celulares(String Marca, String Modelo, double Precio, Color color, Date FechaC, Date FechaV, String Operador) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Precio = Precio;
        this.color = color;
        this.FechaC = FechaC;
        this.FechaV = FechaV;
        this.Operador = Operador;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getFechaC() {
        return FechaC;
    }

    public void setFechaC(Date FechaC) {
        this.FechaC = FechaC;
    }

    public Date getFechaV() {
        return FechaV;
    }

    public void setFechaV(Date FechaV) {
        this.FechaV = FechaV;
    }

    public String getOperador() {
        return Operador;
    }

    public void setOperador(String Operador) {
        this.Operador = Operador;
    }

    @Override
    public String toString() {
        return "Celulares{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", Precio=" + Precio + ", color=" + color + ", FechaC=" + FechaC + ", FechaV=" + FechaV + ", Operador=" + Operador + '}';
    }
    
    
}

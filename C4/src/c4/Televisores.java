package c4;

import java.awt.Color;
import java.util.Date;
import java.util.Scanner;

public class Televisores {

    private String serie;
    protected String Marca;
    String modelo;
    public double precio;
    private Date fecha_cracion;
    private Color color;

    public Televisores() {
    }

    public Televisores(String serie) {
        this.serie = serie;
    }

    public Televisores(String serie, String Marca, String modelo, double precio) {
        this.serie = serie;
        this.Marca = Marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void setMarca(String m) {
        Marca = m;
    }

    public String getMarca() {
        return this.Marca;
    }

    public void setFecha(Date f) {
        fecha_cracion = f;
    }

    public Date getFecha() {
        return fecha_cracion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPrecio(double p) {
        if (p > 0 && p <= 100000) {
            precio = p;
        } else {

        }
    }

    @Override
    public String toString() {
        return "ste es un TV con las siguientes caracterisricas: "+
                "Marca="+Marca+ "Modelo="+modelo;
              }

    
}

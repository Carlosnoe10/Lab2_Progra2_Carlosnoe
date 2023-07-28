/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author cd507
 */
public class Tarea1 {

    
    public static void main(String[] args) {
            int opcion = 0;
        ArrayList<Celulares> Cel = new ArrayList();
        while (opcion != 5) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1- Crear un Celulares  \n"
                    + "2- Mod Celulares\n"
                    + "3- Ver Celulares \n"
                    + "4- Eliminar Celulares \n"
                    + "5- Salida"));
            if (opcion == 1) {
                Celulares c = new Celulares();
                Cel.add(c);

            }
            if (opcion == 2) {
                
                for (int i = 0; i < Cel.size(); i++) {
                   JOptionPane.showMessageDialog(null, i + ". Celulares " + Cel.get(i).toString());
                }
                int retrica = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del Celular que desea Modificar")));
                Celulares Cell= Cel.get(retrica);
            }
            if (opcion == 3) {
                for (int i = 0; i < Cel.size(); i++) {
                    JOptionPane.showMessageDialog(null, i + ". Celulares " + Cel.get(i).toString());
                }
            }
            if (opcion == 4) {
                for (int i = 0; i < Cel.size(); i++) {
                    JOptionPane.showMessageDialog(null, i + ". Celulares " + Cel.get(i).toString());
                }
                int retrica = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del Celular que desea eliminar")));
                Cel.remove(retrica);
            }
           

        }

    }
}
    



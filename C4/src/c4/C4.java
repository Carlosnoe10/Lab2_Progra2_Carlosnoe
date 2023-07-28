package c4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class C4 {
    
    public static void main(String[] args) {
//        Elabore un programa que dado 2 conjuntos de numeros enteros representados por un arraylist c/u retorne un tercer conjunto con la interseccion de numeros primos de dicho conjunto debera imprimirse descendentemente de mayor a menor    
//        ArrayList<Integer> conjunto1= new ArrayList();
//        ArrayList<Integer> conjunto2= new ArrayList();
//        ArrayList<Integer> respuesta= new ArrayList();
//        
//        conjunto1.add(1);
//        conjunto1.add(2);
//        conjunto1.add(3);
//        conjunto1.add(4);
//        conjunto1.add(5);
//        
//        conjunto2.add(6);
//        conjunto2.add(7);
//        conjunto2.add(8);
//        conjunto2.add(9);
//        conjunto2.add(10);
        ArrayList cosas = new ArrayList();
        Televisores tv = new Televisores("LG666");
        int opcion = 0;
        while (opcion == 7) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("--Menu Pricipal-- \n "
                    + " 1- Agregar Numero cualquiera\n"
                    + "2- Agregar un TV \n"
                    + "3- listar Solo numeros \n"
                    + "4- Lista TV \n"
                    + "5- Mod TV \n"
                    + "6- Eliminar TV \n"
                    + "7- Salir"));
            
            if (opcion == 1) {
                cosas.add(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero ")));
                JOptionPane.showMessageDialog(null, "Agregado Exitosmente");
                
            }
            if (opcion == 2) {
                String s, n, mm;
                double p;
//                Televisores tv1 = new Televisores("LG666");
                s = (JOptionPane.showInputDialog("Ingrese su serie "));
                n = (JOptionPane.showInputDialog("Ingrese su marca "));
                mm = (JOptionPane.showInputDialog("Ingrese un modelo "));
                p = Double.parseDouble((JOptionPane.showInputDialog("Ingrese su precio ")));
                cosas.add(new Televisores(s, n, mm, p));
                JOptionPane.showMessageDialog(null, "TV added");
                
            }
            if (opcion == 3) {
                String salida = "";
                for (Object cosa : cosas) {
                    if (cosa instanceof Integer) {
                        salida += cosas.indexOf(cosa) + "- " + cosa + "\n";
                    }
                }
                
                JOptionPane.showMessageDialog(null, "Salida");
            }
            if (opcion == 4) {
                
                String salida = "";
                for (Object cosa : cosas) {
                    if (cosa instanceof Televisores) {
                        salida += cosas.indexOf(cosa) + "- " + cosa + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, "Salida");
            }
            
            if (opcion == 5) {
                int p
            }
        }
    }
    
}

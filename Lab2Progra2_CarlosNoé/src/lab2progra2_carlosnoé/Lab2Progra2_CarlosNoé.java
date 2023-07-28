package lab2progra2_carlosnoé;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2Progra2_CarlosNoé {

    public static void main(String[] args) {
        ArrayList<Gerente> ING = new ArrayList();
        ING = PreLogin(ING);
        boolean Log = true;
        while (Log == true) {
            
        }
    }

    public static ArrayList<Gerente> PreLogin(ArrayList<Gerente> ING) {
        String one = "gerente";
        String contra = "g3r$nt0";

        Gerente Gerr = new Gerente(one, contra);
        ING.add(Gerr);
        return ING;
    }

    public static boolean Login(boolean Key, ArrayList<Gerente> ING) {
        Scanner k1ng = new Scanner(System.in);
        Scanner Queen = new Scanner(System.in);
        System.out.println("--Bienvenido al Login de Gerentes--");
        System.out.println("Ingrese su nombre de usuario");
        String Nombre = k1ng.nextLine();
        System.out.println("Ingrese la Contrasenya");
        String Contrasenya = Queen.nextLine();
        Scanner k1NT = new Scanner(System.in);
        System.out.println("Desea Salir? Escriba 1");
        int Num = k1ng.nextInt();
        Gerente Gerr = new Gerente(ING.get(0).getUsuario(), ING.get(0).getContra());

        if ((ING.get(0).getUsuario().equalsIgnoreCase(Nombre)) && (ING.get(0).getContra().equalsIgnoreCase(Contrasenya)) && ((Num != 1))) {
            return Key;

        } else if ((ING.get(0).getUsuario().equalsIgnoreCase(Nombre)) && (ING.get(0).getContra().equalsIgnoreCase(Contrasenya)) && ((Num == 1))) {
            return false;
        } else {
            System.out.println("Usuario o Contrasenya Equivocados");
            return Login(Key, ING);
        }
        

    }

}

package c2;

import java.util.StringTokenizer;

public class C2 {

    public static void main(String[] args) {

        String cadena = "12111130;CarlosNoe;Primaria,Secundaria,Bachi,universidad:IngSistemas:,Certificado;EscucharMusica";

//        //Imprimir el nombre
//        String [] Tokens= cadena.split(";");
//        System.out.println(Tokens[1]);
//        
//        //Que estudio en pregrado
//        System.out.println(Tokens[2]);
//        String [] Token2=Tokens[2].split(",");
//        System.out.println(Token2[2]);
//        
//        String [] Token3= Token2[0].split(":");
//        System.out.println(Token3);
        StringTokenizer ts = new StringTokenizer(cadena, ";");
//        while (ts.hasMoreElements()) {
//            Object nextElement = ts.nextElement();
//            System.out.println(nextElement);
//        }
        ts.nextElement();
        ts.nextElement();
        StringTokenizer ts2 = new StringTokenizer(ts.nextElement().toString(),",");
//        while (ts2.hasMoreElements()) {
//            Object nextElement = ts2.nextElement();
//            System.out.println(nextElement);
//        }
        
    }

}


package c1;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JColorChooser;


public class C1 {
/* Anotaciones
    Aprenderme las Cntl+Space Shortcuts (es decir sout etc)
    long x= 500L;
    
    Tarea
    hacer un menu administrador 
    1. crear un celular
    2. Mod Celular
    3. Listar los celulares existentes
    4. eliminar celulares
    
    con JOptionPane
    
    
    vamos a guardar informacion en un celular tipo construyendo una clase con
    Marca, Modelo, precio, color, fechacreacion, fechaVenta, operador
    
    */
    
    
    public static void main(String[] args) throws ParseException {
        Date fecha= new Date();
        fecha=new Date(103,1,14);
        System.out.println(fecha);
        fecha.setHours(18);
        fecha.setMinutes(25);
        fecha.setSeconds(32);   
        fecha=new Date("2018/01/01");
        System.out.println(fecha);
        Calendar c= new GregorianCalendar(2005, 4, 25);
        System.out.println(c.getTime());
        DateFormat df=new SimpleDateFormat("MMM/dd/yyyy");
        fecha=df.parse("May/22/2016");
        System.out.println(fecha);
//        DateFormat df2=new SimpleDateFormat("yyyy-MMMMM-d");
//        System.out.println(df2.format(fecha));
        Date fecha2=new Date();
        long diferenciaF= fecha2.getTime()-fecha.getTime();
        System.out.println(diferenciaF/1000/60/60/24/365);
        
        
        
//        Color color ;
//        color = JColorChooser.showDialog(null, "Selecciones un color", Color.red);
//        System.out.println(color);
//        
        
        
    }
    
    
}

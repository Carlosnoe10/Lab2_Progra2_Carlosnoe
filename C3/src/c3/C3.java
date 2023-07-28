package c3;

public class C3 {
//entender torrent de hannoy
    //en los arreglos debe haber 2 elementos escenciales que son el arreglo y el recorrido n-1 o tope
    //caso de bucle en un 

// RCRR: metodo con tres caracteristicas genera una pila al gen
// BT es una recursiva que resuelve la problematica hasta que viene resolviendo la subida hasta su tope
    public static void main(String[] args) {
        //recorrer un arreglo de forma descendente
        int[] arr = {100, 200, 300, 5, 8, 500};
        imprimeArr(arr, arr.length);
    }

    public static void imprimeArr(int[] a, int p) {
        if (p == 0) {
            System.out.println(a[p]);
        } else {
            System.out.println(a[p]);
            imprimeArr(a, p - 1);
        }
    }
}

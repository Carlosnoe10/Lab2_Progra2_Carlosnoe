package lab1progra2_carlosnoe;

import java.util.Scanner;

public class Lab1Progra2_CarlosNoe {

    public static void main(String[] args) {
        Scanner k1ng = new Scanner(System.in);

        System.out.println("--Bienvenido al menu--");
        System.out.println("Ingrese el numero adecuado a la opcion que desea ingresar: ");
        System.out.println("Opcion 1. Ejercicio 1 ");
        System.out.println("Opcion 2. Ejercicio 2");
        System.out.println("Opcion 3. Salida ");

        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 3) {
                if ((menu > 0) && (menu < 4)) {
                    x++;
                    switch (menu) {
                        case 1:
                            for (int i = 0; i < 1; i++) {

                                System.out.println("Ingrese el polinomio: (ax^2 + bx + c) ");
                                System.out.print("a= ");
                                int poli1 = k1ng.nextInt();
                                System.out.print("b= ");
                                int poli2 = k1ng.nextInt();
                                System.out.print("c= ");
                                int poli3 = k1ng.nextInt();
                                if ((poli1 == 0) || (poli2 == 0) || (poli2 == 0)) {
                                    System.out.println("Ingrese numeros");
                                    i--;
                                } else if ((poli1 >= 1) || (poli2 >= 1) || (poli2 >= 1)) {
                                    int DerivadaBa = Derivada(poli1);
                                    i++;
                                    double Verti = VerticeA(poli1, poli2);
                                    double Verti2 = VerticeB(DerivadaBa, poli2);
                                    int valor0 = 0;
                                    double valor01 = 0;

                                    double resultado = RecursivaNegativa(valor0, valor01, poli1, poli2, poli3, DerivadaBa, poli2);
                                    double resultado2 = RecursivaPositiva(valor0, valor01, poli1, poli2, poli3, DerivadaBa, poli2);
                                    System.out.println("Ejecucion1: x0= " + resultado);
                                    System.out.println("Ejecucion1: x0=" + resultado2);
                                }

                            }
                            break;
                        case 2:
                            System.out.println("Ingrese el numero que desea encontrar el seno, coseno y tangente: ");
                            int taseco = k1ng.nextInt();
                            if (Math.abs(taseco) < 3.14 / 2) {

                                double pam = 0;
                                System.out.println("El seno es: " + RecursivaSeno(1000, taseco, pam));
                                System.out.println("El Coseno es: " + RecursivaCoseno(1000, taseco, pam));
                                System.out.println("La Tangente es: " + RecursivaTangente(1000, taseco, pam));
                            } else {
                                double pam = 0;
                                System.out.println("El seno es: " + RecursivaSeno(1000, taseco, pam));
                                System.out.println("El Coseno es: " + RecursivaCoseno(1000, taseco, pam));
                                System.out.println("No se podra sacar la tangente ");
                                
                            }

                            break;
                    }

                    System.out.println("--Bienvenido al menu--");
                    System.out.println("Ingrese el numero adecuado a la opcion que desea ingresar: ");
                    System.out.println("Opcion 1. Ejercicio 1 ");
                    System.out.println("Opcion 2. Ejercicio 2");
                    System.out.println("Opcion 3. Salida");
                    menu = k1ng.nextInt();

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }
            }
        }
        System.out.println("Fin");
    }

    public static int Derivada(int a) {
        int DerivadaR = a * 2;
        return DerivadaR;
    }

    public static double VerticeA(int a, int b) {
        double vertice = -b / (2 * a);
        return vertice;
    }

    public static double VerticeB(int a, int b) {
        double vertice = -b / (2 * a);
        return vertice;
    }

    public static double RecursivaNegativa(int limite, double recurr, int a, int b, int c, int aD, int bD) {
        recurr = limite - ((a ^ 2 * (limite) + b * (limite) + c) / (aD * (limite) + bD));
        if (limite == -100) {
            return recurr;
        } else {
            return recurr = RecursivaNegativa(limite - 1, recurr, a, b, c, aD, bD);
        }

    }

    public static double RecursivaPositiva(int limite, double recurr, int a, int b, int c, int aD, int bD) {
        recurr = limite - ((a ^ 2 * (limite) + b * (limite) + c) / (aD * (limite) + bD));
        if (limite == 100) {
            return recurr;
        } else {
            return recurr = RecursivaNegativa(limite + 1, recurr, a, b, c, aD, bD);
        }

    }

    public static double RecursivaSeno(int N, int NumeroAV, double Respu) {
        double Prerespu = (2 * (N) + 1);
        Respu = (((-1) ^ N)) / Factorial(Prerespu, 0) * (NumeroAV ^ 2 * N + 1);
        if (N == 0) {
            return Respu;
        } else {
            return Respu = RecursivaSeno(N - 1, NumeroAV, Respu);
        }

    }

    public static double RecursivaCoseno(int N, int NumeroAV, double Respu) {
        double Prerespu = (2 * (N));
        Respu = (((-1) ^ N)) / Factorial(Prerespu, 0) * (NumeroAV ^ 2 * N);
        if (N == 0) {
            return Respu;
        } else {
            return Respu = RecursivaSeno(N - 1, NumeroAV, Respu);
        }
    }

    public static double RecursivaTangente(int N, int NumeroAV, double Respu) {
        double Prerespu = (2 * (N));
        Respu = ((((2 ^ N) * (-4) ^ N) * (1 - 4 ^ N))) / Factorial(Prerespu, 0) * (NumeroAV ^ 2 * (N) - 1);
        if (N == 1) {
            return Respu;
        } else {
            return Respu = RecursivaSeno(N - 1, NumeroAV, Respu);
        }
    }

    public static double Factorial(double Pre, double resp) {
        resp += Pre * Pre;
        if (Pre == 0) {
            return resp;
        } else {
            return resp = Factorial(Pre - 1, resp);
        }
    }
}

import java.util.Scanner;

public class Ej05_Sumatoria {
    public static void main(String[] args) {
        System.out.println("Leer un numero entero y calcular la sumatoria hasta el numero leido.\n");
        int numero = leerNumero();
        if (validarNumero(numero)) {
            int resultado = sumatoria(numero);
            mostrarResultado(numero, resultado);
        } else {
            System.out.println("Por favor, ingrese un numero entero no negativo.");
        }
    }

    public static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int n = sc.nextInt();
        return n;
    }

    public static boolean validarNumero(int n) {
        return n >= 0;
    }

    public static int sumatoria(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumatoria(n - 1);
    }

    public static void mostrarResultado(int n, int resultado) {
        if (n == 0) {
            System.out.println("La sumatoria de 0 es: 0");
            return;
        }
        String formula = construirFormula(n);
        System.out.println("La sumatoria de " + formula + " es: " + resultado);
    }

    public static String construirFormula(int n) {
        if (n == 1) {
            return "1";
        }
        return construirFormula(n - 1) + " + " + n;
    }

}
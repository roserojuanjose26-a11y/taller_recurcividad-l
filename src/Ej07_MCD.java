import java.util.Scanner;

public class Ej07_MCD {
    public static void main(String[] args) {
        System.out.println("Leer dos numeros enteros y calcular el maximo comun divisor (M.C.D.)\n");
        int m = leerNumero("Ingrese el primer numero: ");
        int n = leerNumero("Ingrese el segundo numero: ");
        if (validarNumero(m) && validarNumero(n)) {
            int resultado = mcd(m, n);
            mostrarResultado(m, n, resultado);
        } else {
            System.out.println("Por favor, ingrese numeros enteros no negativos. mayores a cero.");
        }
    }

    public static int leerNumero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        int n = sc.nextInt();
        return n;
    }

    public static boolean validarNumero(int n) {
        return n > 0;
    }

    public static int mcd(int m, int n) {
        // En caso de que m sea menor que n, intercambiamos los valores para cumplir con
        // la condicion M >= N
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        if (n == 0) {
            return m;
        }
        return mcd(n, m % n);
    }

    public static void mostrarResultado(int m, int n, int resultado) {
        System.out.println("El MCD de " + m + " y " + n + " es: " + resultado);
    }
}

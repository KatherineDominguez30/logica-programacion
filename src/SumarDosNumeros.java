/*https://phantom-comet-08a.notion.site/Lista-de-problemas-para-principiantes-en-la-programaci-n-4ab904d49a9f4edd92e3c79711f18bb8
Lista de problemas 1:
1. **Sumar dos números:**
    - Entrada: Dos números enteros.
    - Salida: La suma de los dos números*/

import java.util.Scanner;
public class SumarDosNumeros {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer numero:");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el primer numero:");
        int num2  = scanner.nextInt();

        int suma = num1 + num2;

        System.out.println(" La Suma es: " + suma);
        scanner.close();
    }
}

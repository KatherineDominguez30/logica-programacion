
/*Problema:
 Confeccionar en un programa que lea por teclado tres numeros distintos y nos muestre el mayor.*/

import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercero numero: ");
        int num3 = scanner.nextInt();


        System.out.println("Primer numero ingresado: " + num1 +
                            " \nSegundo numero ingresado: " + num2 +
                              " \nTercer numero ingresado: " + num3);
        scanner.close();
        compararNumero(num1,num2,num3);
    }

    public static void compararNumero(int num1, int num2, int num3){

        if (num1 > num2 && num1 > num3){
            System.out.println("Numero " + num1 + " es mayor");
        } else if (num2 > num3 ) {
            System.out.println("Numero " + num2 + " es mayor");
        } else {
            System.out.println("Numero " + num3 + " es mayor");
        }

    }
}

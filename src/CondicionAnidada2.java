/*Problema: Se carga por teclado tres numeros distintos.
Mostrar por pantalla el mayor de ellos*/

import java.util.Scanner;
public class CondicionAnidada2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer valor: ");
        int num1 = scanner.nextInt();
        System.out.print("el siguente: ");
        int num2 = scanner.nextInt();
        System.out.print("el ultimo: ");
        int num3 = scanner.nextInt();
        funcionCondicionAnidada2( num1,  num2,  num3);

    }
    public static void funcionCondicionAnidada2(int num1, int num2, int num3){
         if (num1 >= num2 && num1 >= num3){
             System.out.print("El numero " + num1 + " es mayor");
         } else if (num2 >= num3) {
             System.out.print("El numero " + num2 + " es mayor");
         } else {
             System.out.print("El numero " + num3 + " es mayor");
        }

    }

}

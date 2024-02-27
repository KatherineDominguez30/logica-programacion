/*Problema: Se ingresa tres valores por teclado, si dos son iguales se imprime
 la suma del primero con el segundo y a este resultado se lo multiplicamos por el tercero.*/

import java.util.Scanner;

public class CompararValores {

    public static void main(String[] args){
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa valor 1: ");
        num1=scanner.nextInt();
        System.out.print("Ingresa valor 2: ");
        num2=scanner.nextInt();
        System.out.print("Ingresa valor 3: ");
        num3=scanner.nextInt();
        comprarValores(num1, num2, num3);
        scanner.close();
    }

    public static void comprarValores(int num1, int num2, int num3){
           if (num1 == num2 && num2 == num3 ){
           //int resultado = (num1 + num2) * num3;
           int suma = num1 + num2;
           int resultado = suma * num3;
            System.out.println("La suma del primer numero y el segundo dan: " + suma);
            System.out.println("Si multiplicamos el tercer valor ingresadp: " + num3 + ", mas la suma de los dos primeros valores: " + suma + " dan como resultado: " + resultado);
        } else {
            System.out.println("Los valores no son iguales");

        }

    }

}

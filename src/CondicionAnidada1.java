/*Problema: confeccionar un programa que pida por teclado tres notas de un alumno, calcule el promedio e
* imprima alguno de estos mensajes:
* si el promedio es >=7 mostrar
* si el promedio es >= 4 y <7 mostrar "Regular"
* si ek promedio es <4 mostrar "Reprobado"*/

import java.util.Scanner;
public class CondicionAnidada1 {
    public static void main(String[] args){
        funciionAnidada();
    }
    public static void funciionAnidada(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese las tres notas: ");
        int nota1 = scanner.nextInt();
        System.out.print("la siguente: ");
        int nota2 = scanner.nextInt();
        System.out.print("la ultima: ");
        int nota3 = scanner.nextInt();

        int promedio = (nota1+nota2+nota3)/2 ;

        if (promedio >= 7){
            System.out.println("Promocionado");
        } else if (promedio >=4) {
            System.out.println("Regular");
        } else {
            System.out.println("Reprobado");
        }
        scanner.close();
    }
}

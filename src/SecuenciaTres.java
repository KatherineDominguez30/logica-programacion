/*Escribir un programa en el cual se ingresen
* cuatro numeros, calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto*/
import java.util.Scanner;
public class SecuenciaTres {
    public static void main(String[] args){
         sumaNumero();
    }

    public static void sumaNumero(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el 1re numero: ");
        int num1= scanner.nextInt();
        System.out.print("Ingresa el 2do numero: ");
        int num2= scanner.nextInt();
        System.out.print("Ingresa el 3re numero: ");
        int num3= scanner.nextInt();
        System.out.print("Ingresa el 4to numero: ");
        int num4= scanner.nextInt();

        int suma = num1 + num2;
        System.out.println("La suma de los dos primeros numeros es: " + suma);
        int pro = num3 * num4;
        System.out.println("El producto de los dos ultimos numeros es: " + pro);
        scanner.close();
    }
}

import java.util.Scanner;

/*Problema: Realizar un programa que lea cuatro valores numericos e informar su suma y promedio*/
public class SecuenciaCuatro {
    public static void main(String[] args) {
        sumaYPromedio();
    }

    public static void sumaYPromedio(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el 1re numero: ");
        int num1= scanner.nextInt();
        System.out.print("Ingresa el 2do numero: ");
        int num2= scanner.nextInt();
        System.out.print("Ingresa el 3re numero: ");
        int num3= scanner.nextInt();
        System.out.print("Ingresa el 4to numero: ");
        int num4= scanner.nextInt();

        int suma = num1 + num2 + num3 + num4;
        System.out.println("La suma de los dos primeros numeros es: " + suma);
        int pro = suma /4;
        System.out.println("El promedio es: " + pro);

        scanner.close();
    }
}

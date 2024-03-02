/*Problema: confeccionar un programa que permita cargar un numero entero positivo de hasta tres
* cifras y muestre un mensaje indicando si tiene 1,2, o 3 cifras. Mostrar un mensaje de error si el numero de
* cifras es mayor*/
import java.util.Scanner;
public class CondicionAnidada4 {
    public static void main(String[] args){
        funcionCondicionAnidada4String();

    }

    public static void funcionCondicionAnidada4String() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        String num1 = scanner.nextLine();
        int cantidad = num1.length();

        if (cantidad <= 3){
            System.out.println("El número " + num1 + " tiene " + cantidad + " dígitos.");
        } else {
            System.out.println("ERROR! El numero de cifras es mayor");
        }
        }

    }

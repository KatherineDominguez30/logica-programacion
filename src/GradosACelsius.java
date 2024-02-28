/*Convertir grados Celsius a Fahrenheit:
* - Entrada: Temperatura en grados Celsius.
- Salida: Temperatura en grados Fahrenheit.
* formula: f=(1.8*c) + 32 */

import java.util.Scanner;
public class GradosACelsius {
    public static void main(String[] args){
        convertirGradosCelsiusFahrenheit();
    }
    public static void convertirGradosCelsiusFahrenheit(){
        Scanner scanner = new Scanner(System.in);

        final double FAHRENHEIT = 1.8;

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        float celsius  = scanner.nextFloat();

        float fahrenheit =(float) (FAHRENHEIT * celsius) + 32;
        System.out.println(" La temperatura en FAHRENHEIt es: " + fahrenheit);
        scanner.close();
    }
}

/*Como el resultado es de tipo double, necesitas convertirlo explícitamente de nuevo a float para que coincida con el
 tipo de dato de la variable fahrenheit, que has declarado como float. Esto se hace mediante el casting, colocando
  (float) delante del resultado de la operación, lo que indica que deseas que el resultado sea tratado como un float.*/

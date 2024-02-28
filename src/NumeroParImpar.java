/*3. **Verificar si un número es par o impar:**
    - Entrada: Un número entero.
    - Salida: "Par" o "Impar".*/

import java.util.Scanner;
public class NumeroParImpar {

    public static void main(String[] args){
        FuncNumeroParImpar();
    }

    public static void FuncNumeroParImpar(){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el numero: ");
        int num = scanner.nextInt();

        if (num % 2 ==0 ){
            System.out.print("El numero " + num + " es par. ");
        } else {
            System.out.print("El numero " + num + " es impar ");
        }
        scanner.close();
    }


}

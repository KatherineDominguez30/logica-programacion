/*Problema: Se carga una fecha (dia, mes y año) por teclado.
Mostrar un mensaje si corrresponde al primer trimestre del año(enero, febrero, marzo)
Cargar por teclado el valor numerico del dia, mes y año.
Ejemplo: dia: 10 mes:2 año:2024*/

import java.util.Scanner;

public class IdentificarMes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el dia");
        int dia = scanner.nextInt();
        System.out.println("Introduce el mes");
        int mes = scanner.nextInt();
        System.out.println("Introduce el ano");
        int ano = scanner.nextInt();
        
        verTrimestreOr(dia, mes, ano);
        verTrimestreAnd(dia, mes, ano);
    }
// Con el operador Or
    public static void verTrimestreOr(int dia, int mes, int ano){

        if (mes == 1 || mes == 2 || mes == 3) {
            System.out.println("Te encuentras en el primer trimestre");
        } else if (mes == 4 || mes == 5 || mes == 6) {
            System.out.println("Te encuentras en el segundo trimestre");
        } else if (mes == 7 || mes == 8 || mes == 9) {
            System.out.println("Te encuentras en el tercer trimestre");
        }else if (mes == 10 || mes == 11 || mes == 12) {
            System.out.println("Te encuentras en el cuarto trimestre");
        }
    }
// con el operador AND
    public static void verTrimestreAnd(int dia, int mes, int ano){
        if (mes >= 1 &&  mes <= 3) {
            System.out.println("Te encuentras en el primer trimestre");
        } else if (mes >= 4 && mes <= 6) {
            System.out.println("Te encuentras en el segundo trimestre");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("Te encuentras en el tercer trimestre");
        }else if (mes >= 10 && mes <= 12) {
            System.out.println("Te encuentras en el cuarto trimestre");
        }
    }

}

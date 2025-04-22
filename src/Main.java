import java.util.Scanner;

public class Main {
    int myNumber = 10;
    static int[] myArray = {1, 2, 3, 4, 5, 5};
    static String[] diasDelasemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione como quisiera ver el array");
        System.out.println("1: Imprimir indice 2 del array");
        System.out.println("2: Imprimir todo el tamano del array, e imprimir el array completo");
        System.out.println("3: Loop para imprimir el array");
        System.out.println("4: Imprimir el array con un for each");
        System.out.println("5: Imprimir array con strings");
        System.out.println("6: Imprimir el array con un while que recorra diasDelasemana");

        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("myArray[2] = " + myArray[2]);
                break;
            case 2:
                System.out.println("myNumber = " + myArray.length);
                break;
            case 3:
                for (int i = 0; i < myArray.length; i++) {
                    System.out.printf("My Array[%d] = %d\n", i, myArray[i]);
                }
                break;
            case 4:
                for (int number : myArray) {
                    System.out.println(number);
                }
                break;
            case 5:
                for (String dias : diasDelasemana) {;
                    System.out.println(dias);
                }
                break;
            case 6:
                int i = 0;
                while (i < diasDelasemana.length) {
                    System.out.printf("Dias de la semana [%d] = %s\n", i, diasDelasemana[i]);
                    i++;
                }
                 break;
            default:
                System.out.println("Opcion no valida");
        }


    }



}
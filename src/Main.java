import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void holamundo(){
        System.out.println("Mira mama mi primer programa en java");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu de opciones");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Suma de dos numeros");
            System.out.println("3. Numero par o impar");
            System.out.println("4. Factorial de un numero");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Numero Mayor y Menor");
            System.out.println("7. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    holamundo();
                    break;
                case 2:
                    sumarDosNumeros(scanner);
                    break;
                    case 3:
                    determinarParImpar(scanner);
                        break;
                        case 4:
                    calcularFactorial(scanner);
                        break;
                case 5:
                    mostrarTablaMultiplicar(scanner);
                        break;
                case 6:
                    mostrarNumeroMayorMenor(scanner);
                    break;
                case 7:
                    System.out.println("Saliendo del Programa...Chao");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion!=6);
        scanner.close();
    }
    public static void sumarDosNumeros(Scanner scanner) {
        System.out.println("Ingrese el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }
public static void determinarParImpar(Scanner scanner) {
        System.out.println("Ingrese un numero");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("El Numero es par");
        }else {
            System.out.println("El Numero es impar");
        }
     }
     public static void calcularFactorial(Scanner scanner) {
        System.out.println("Ingrese un numero");
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
         System.out.println("El factorial de: " + num + " es: " + factorial);
     }
     public static void mostrarTablaMultiplicar(Scanner scanner) {
        System.out.println("Ingrese un numero");
        int num = scanner.nextInt();
         System.out.println("Tabla de Multiplicar ascendente:");
         for (int i = 1; i <= 10; i++) {
             System.out.println( num + "*" + i + " = " + (num * i));
         }

     }
     public static void mostrarNumeroMayorMenor(Scanner scanner) {
        int num;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

         System.out.println("Ingresa una serie de numeros enteros (Termina con un numero negativo):");
         while (true) {
             num = scanner.nextInt();
             if (num < 0 ) {
                 break;
             }
             if (num > mayor) {
                 mayor = num;
             }
             if (num < menor) {
                 menor = num;
             }
         }
         if (mayor == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
      System.out.println("No Ingresaste ningun numero valido");
         } else {
             System.out.println("El mayor es " + mayor);
             System.out.println("El menor es " + menor);
         }
         scanner.close();
     }
}
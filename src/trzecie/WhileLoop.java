package trzecie;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // podajemy liczby tak długo aż zostanie podane 0, wypisujemy największą liczbę
        // sprawdzenie ilości cyfr
        // suma cyfr liczby
        // program liczący ilość podanej cyfry w liczbie
        // wypisać dzielniki liczby
        // spr czy liczba jest pierwsza
        // wyliczyć średnią podanych liczb
        // "dupochron" - parzyste większe od 10
        // binarna reprezentacja liczby
        // menu

        // zad 1

        System.out.println("Wpisuje liczby tak długo dopóki nie zostanie podane 0.");
        System.out.println("Podaj liczbę:");

        int value = scanner.nextInt();
        int maxValue = 0;

        while (value != 0){
            System.out.println("Podaj liczbę:");
            value = scanner.nextInt();
            if (value > maxValue){
                maxValue = value;
            }
        }

        System.out.println("The biggest is " + maxValue);

        System.out.println("program wyświetla ile cyfr ma podana liczba.");
        System.out.println("Podaj liczbę:");
        int n = scanner.nextInt();
        int i = 0;

        while (n != 0){
            n /= 10;
            i++;
        }

        System.out.println(i);


        System.out.println("program wyświetla sume cyfr podanej liczby.");
        System.out.println("Podaj liczbę:");
        n = scanner.nextInt();
        i = 0;
        int sum =0;

        while (n != 0){
            i = n % 10;
            n /= 10;
            sum +=i;

        }

        System.out.println(sum);

        System.out.println("program wyświetla ile razy w danej liczbie wystąpila podana cyfra.");
        System.out.println("Podaj liczbę:");
        n = scanner.nextInt();

        System.out.println("Podaj cyfre:");
        int digit = scanner.nextInt();

        i = 0;

        while (n != 0){

            if (n % 10 == digit){
                i++;
            }
            n /= 10;
        }

        System.out.println(i);





    }

    private static void whileLoopExercises(Scanner scanner) {
    /*
    System.out.println("Podaj liczbę podzilną przez 15  ");
    int number = scanner.nextInt();
    //int tmp = 0;


    while (number%15 != 0){
        System.out.println("Podaj liczbę podzilną przez 15  ");
        number = scanner.nextInt();
    }

    System.out.println("Ta liczba to " + number);

    System.out.println();

    System.out.println("Podaj liczbę");
    */

        /*
        while (value !=0){
            System.out.println("Podaj liczbę");
            value = scanner.nextInt();
        }
        System.out.println("OK");
        */

        boolean result = true;

        int sum = 0;
        while (result){
            int value = scanner.nextInt();
            sum += value;
            if (value == 0){
                result = false;
            }

            //result = value !=0;

        }

        System.out.println("Sum = " + sum);
    }


}


// w domu: uporzadkować program, szczególnie nazwy, posortować zadania i je rozgraniczyć!!! + niezrobione zadania
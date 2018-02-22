package trzecie;

import java.util.Scanner;

public class warmup {
    public static void main(String[] args) {

        // zad 1
        // wczytać liczbe n
        // zapytać n razy o liczbe
        // podzielna przez 2 to poinformować
        // podzielna przez 3 to poinformować
        // podzielna przez 6 to poinformować

        // zad 2
        // zdefiniować n
        // pobiera n liczb
        // ma wypisać czy liczba jest mniejsza czy wieksza od poprzedniej

        // zad 3
        // obliczyć sume parzystych liczb, niepodzielnych przez 3

        // zad 4
        //obliczyć silnie dla n

        //zad 1

        Scanner scanner = new Scanner(System.in);
        int n, a;

        System.out.println("Insert a number of elements: ");
        n = scanner.nextInt();



        for (int i = 0; i <n; i++){
            System.out.println("Insert a number:");
            a = scanner.nextInt();

            if (a % 6 == 0){
                System.out.println("Podzielna przez 6");
            } else if (a %2 == 0){
                System.out.println("Podzielna przez 2");
            } else if (a % 3 == 0){
                System.out.println("Podzielna przez 3");
            }else {
                System.out.println("Nie jest podzielna przez 2,3 ani 6.");
            }


        }

        // zad 2

        int previousValue = 0;
        for (int i = 0; i < n; i++){
            System.out.println("Insert next value: ");
            int value = scanner.nextInt();
            if (value > previousValue){
                System.out.println("Value is bigger than previous one.");
            } else if (value == previousValue){
                System.out.println("Value is equal to previous one.");
            }else {
                System.out.println("Value is smaller than previous one.");
            }

            previousValue = value;

        }

        // zad 3

        int sum = 0;
        for (int i = 0; i <n; i++){
            if (i % 2 == 0 && i % 3 !=0) {
                sum += i;
            }
        }

        for (int i =0; i <n ; i++)

        System.out.println("Sum = " + sum);

        // zad 4

        long factorial = 1;

        for (int i = 1; i <= n; i++){
            factorial *= i;
        }

        System.out.println("Factorial = " + factorial);
    }
}

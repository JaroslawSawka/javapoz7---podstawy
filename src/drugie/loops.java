package drugie;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert number of elements to multiply:");
        int n = scanner.nextInt();

        for (int i = 0; i <n; i++){
            System.out.println("Insert number:");
            int number = scanner.nextInt();
            System.out.println((i+1) + " Pow(" + number +") = " + (number * number));
        }

        System.out.println("End of program.");

    }
}

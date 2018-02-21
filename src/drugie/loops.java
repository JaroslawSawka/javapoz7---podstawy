package drugie;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        forLoopExample();

    }

    private static void forLoopExample() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert number of elements:");
        int n = scanner.nextInt();

        System.out.println();
        System.out.println();

        for (int i = 0; i <n; i++){
            System.out.println(2*(i+1));
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i <n; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i <n; i++){
            if (i%3 == 0){
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i <n; i++){
            System.out.println("a");
        }

        System.out.println();
        System.out.println();

        int sum = 0;
        for (int i = 1; i <=n; i++){
            sum +=i;
        }

        System.out.println(sum);


        System.out.println("End of program.");
    }
}

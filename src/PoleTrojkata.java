import java.util.Scanner;

public class PoleTrojkata {
    public static void main(String[] args) {
        System.out.println("The program calculates the field and perimeter of an equilateral triangle.");
        System.out.println("Enter the length of the side a:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Enter the length of the side a:");
        int b = scanner.nextInt();

        System.out.println("Enter the length of the side a:");
        int c = scanner.nextInt();

        if (((a+b > c) && (b+c > a) && (a+c >b)) && (a*a + b*b == c*c) ) {
            double area = 0.5 * a *  b;
            int circuit = a+b+c;
            double average = circuit / 3.0;

            System.out.println("Area = " + area);
            System.out.println("Circuit = " + circuit);
            System.out.println("Average = " + average);

        } else {
            System.out.println("Provided values are not correct.");
        }





    }
}

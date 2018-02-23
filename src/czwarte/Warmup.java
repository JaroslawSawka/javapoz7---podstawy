package czwarte;

import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {
        System.out.println("Insert a number:");
        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int reverseNumber = 0;
//
//        while (number!= 0){
//            int digit = number%10;
//            reverseNumber *=10;
//            reverseNumber += digit;
//            number /= 10;
//        }
//
//        System.out.println(reverseNumber);
//
//
//        System.out.println("How many numbers?");
//        int n = scanner.nextInt();
//        int sum = 0;
//
//
//        for (int i = 0; i < n; i++){
//            System.out.println("Insert a number:");
//            int value = scanner.nextInt();
//            while (value != 0){
//                int digit = value % 10;
//                value /= 10;
//                sum += digit;
//
//            }
//        }
//        System.out.println(sum);

//        System.out.println("Insert number with zeros: ");
//        int numberWithZeros = scanner.nextInt();
//        int numberWithoutZeros = 0;
//
//        while (numberWithZeros != 0){
//            int digit = numberWithZeros % 10;
//            if (digit != 0){
//                numberWithoutZeros *= 10;
//                numberWithoutZeros += digit;
//            }
//            numberWithZeros /= 10;
//        }
//        System.out.println("numberWithoutZeros = " + numberWithoutZeros);

        System.out.println("Insert number with zeros: ");
        int numberWithZeros = scanner.nextInt();
        int numberWithoutZeros = 0;
        int multiplier = 1;
        while (numberWithZeros != 0){
            int digit = numberWithZeros % 10;
            if (digit != 0){
                numberWithoutZeros += digit * multiplier;
                multiplier *= 10;
            }
            numberWithZeros /= 10;
        }

        System.out.println("numberWithoutZeros = " + numberWithoutZeros);
//
   }
}

//+= (number%10)*(int)Math.pow(10, i);
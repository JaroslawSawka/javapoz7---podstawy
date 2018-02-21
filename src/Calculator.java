import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Calculator");

        Scanner reader = new Scanner(System.in);

        System.out.println("Insert first value:");
        int firstValue = reader.nextInt();

        System.out.println("Insert second value:");
        int secondValue = reader.nextInt();

        if (secondValue != 0) {
            int resultOfAddition = firstValue + secondValue;
            int resultOfSubstraction = firstValue - secondValue;
            int resultOfMultiplication = firstValue * secondValue;
            double resultOfDivision = firstValue / (double)secondValue;

            System.out.println("Result of addition = " + resultOfAddition);
            System.out.println("Result of substraction = " + resultOfSubstraction);
            System.out.println("Result of multiplication = " + resultOfMultiplication);
            System.out.println("Result of division = " + resultOfDivision);

            //System.out.println("sum = " + firstValue + secondValue); = 58, łączy tekst

            System.out.println("sum = " + (firstValue + secondValue));

            System.out.println(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
            System.out.println(firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
            System.out.println(firstValue + " * " + secondValue + " = " + (firstValue * secondValue));
            System.out.println(firstValue + " / " + secondValue + " = " + (firstValue / (double)secondValue));

        } else {
            System.out.println("Second value can't be 0");
        }

        if (firstValue == secondValue){
            System.out.println("First value is equal second value");
        } else {
            System.out.println("First value is not equal second value");
        }

        if (firstValue > secondValue){
            System.out.println("First value: " + firstValue + " is bigger.");
        } else if (firstValue < secondValue){
            System.out.println("Second value: " + secondValue + " is bigger.");
        } else {
            System.out.println("First value is equal second value");
        }

        if (secondValue != 0){
            if (firstValue % secondValue == 0)
            {
                System.out.println("There is no division with the rest.");
            } else {
                System.out.println("First value % second value = " + (firstValue % secondValue));
            }
        } else {
            System.out.println("Second value can't be 0");
        }

        if (firstValue % 2 == 0){
            System.out.println("First value is even.");
        } else {
            System.out.println("First value is not even.");
        }

        if (secondValue % 2 == 0){
            System.out.println("Second value is even.");
        } else {
            System.out.println("Second value is not even.");
        }




        /*
        int resultOfAddition = firstValue + secondValue;
        int resultOfSubstraction = firstValue - secondValue;
        int resultOfMultiplication = firstValue * secondValue;
        double resultOfDivision = firstValue / (double)secondValue;

        System.out.println("Result of addition = " + resultOfAddition);
        System.out.println("Result of substraction = " + resultOfSubstraction);
        System.out.println("Result of multiplication = " + resultOfMultiplication);
        System.out.println("Result of division = " + resultOfDivision);

        //System.out.println("sum = " + firstValue + secondValue); = 58, łączy tekst

        System.out.println("sum = " + (firstValue + secondValue));

        System.out.println(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
        System.out.println(firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
        System.out.println(firstValue + " * " + secondValue + " = " + (firstValue * secondValue));
        System.out.println(firstValue + " / " + secondValue + " = " + (firstValue / (double)secondValue));

        //int someValue = reader.nextInt();
        //System.out.println(someValue);

        */
    }

}

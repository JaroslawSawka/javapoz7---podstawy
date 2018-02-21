import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        // zapytaj użytkownika o wiek
        int wiek;
        System.out.println("Insert your sge:");

        Scanner scanner = new Scanner(System.in);
        wiek = scanner.nextInt();

        /*
        if (wiek < 6){
            System.out.println("Powinieneś iść do przedszkola");
        } else if (wiek < 12){
            System.out.println("Powinieneś iść do podstawówki");
        } else if (wiek < 16){
            System.out.println("Powinieneś iść do gimbazy");
        } else if (wiek < 20){
            System.out.println("Powinieneś iść do szkoły średniej");
        } else {
            System.out.println("Studia / praca.");
        }
        */

        if (wiek > 30 && wiek % 3 == 0){
            System.out.println("a");
        }

        if ((wiek < 15 || wiek > 60) && wiek % 5 == 2){
            System.out.println("b");
        }

    }
}

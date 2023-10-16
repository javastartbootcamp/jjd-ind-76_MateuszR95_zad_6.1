package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isNumberGuessed = false;

        while (!isNumberGuessed) {
            System.out.println("Podaj liczbę");
            int userNumber = scanner.nextInt();

            if (userNumber < 100) {
                System.out.println("Podana liczba jest za mała");
            } else if (userNumber > 200) {
                System.out.println("Podana liczba jest za duża");
            } else {
                if (userNumber % 3 == 0) {
                    System.out.println("Twoja liczba jest ok");
                    isNumberGuessed = true;
                } else {
                    System.out.println("Liczba nie jest podzielna przez 3");
                }

            }
        }
    }
}

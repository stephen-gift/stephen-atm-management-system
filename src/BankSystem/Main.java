package BankSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int atmnumber = 12345;
        int atmpin = 123;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Stephen ATM Machine !!!");
        System.out.println("Enter your Atm Number: ");
        int atmNumber = scanner.nextInt();

        System.out.println("Enter your PIN: ");
        int atmPin = scanner.nextInt();


        if ((atmNumber == atmnumber)&&(atmpin == atmPin)) {
            System.out.println("Validation done");
        }else {
            System.out.println("Incorrect Number or Pin");
            System.exit(0);
        }
    }
}

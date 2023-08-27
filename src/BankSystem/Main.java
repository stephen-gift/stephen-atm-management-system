package BankSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperationInterface operationInterface = new AtmOperationImplementation();
        int atmnumber = 12345;
        int atmpin = 123;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Stephen ATM Machine !!!");
        System.out.println("Enter your Atm Number: ");
        int atmNumber = scanner.nextInt();

        System.out.println("Enter your PIN: ");
        int atmPin = scanner.nextInt();


        if ((atmNumber == atmnumber)&&(atmpin == atmPin)) {
            while (true){
                System.out.println("""
                         ****************************
                         Choose an option ->
                         
                         1. View Available balance
                         2. Withdraw Amount
                         3. Deposit Amount
                         4. View Mini-Statement
                         5. Exit
                         ****************************
                         Enter Choice:
                        """);
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> operationInterface.viewBalance();
                    case 2 -> {

                    }
                    case 3 -> {
                        System.out.println("Enter Amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        operationInterface.depositAmount(depositAmount);

                    }
                    case 4 -> {
                    }
                    case 5 -> {
                        System.out.println("Collect your ATM card \n" +
                                           "Thank you for using Stephen ATM Machine");
                        System.exit(0);

                    }
                    default -> System.out.println("Please Enter correct choice: ");
                }
            }
    } else{
            System.out.println("Incorrect Number or Pin");
            System.exit(0);
        }
}}




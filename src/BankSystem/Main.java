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
            while (true){
                System.out.println("""
                               Choose an option\s
                                1. View Available balance\s
                                2. Withdraw Amount\s
                                3. Deposit Amount\s
                                4. View Mini-Statement\s
                                5. Exit\s
                                Enter Choice: \s""");
                System.out.println("Validation done");
                int choice = scanner.nextInt();

                 switch (choice){
                    case 1:{

                    }
                    case 2:{

                    }
                    case 3:{

                    }
                    case 4:{

                    }
                    case 5:{
                        System.out.println("Collect your ATM card \n" +
                                "Thank you for using Stephen ATM Machine");
                        System.exit(0);
                    }
                    default:{
                        System.out.println("Please Enter correct choice: ");
                    }
            }
            }
    } else{
            System.out.println("Incorrect Number or Pin");
            System.exit(0);
        }
}}




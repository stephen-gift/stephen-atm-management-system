package BankSystem;

public class AtmOperationImplementation implements AtmOperationInterface {

    ATM atm = new ATM();
    @Override
    public void viewBalance() {

        System.out.println("Available balance is: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {

    }

    @Override
    public void depositAmount(double depositAmount) {

    }

    @Override
    public void viewMiniStatement() {

    }
}

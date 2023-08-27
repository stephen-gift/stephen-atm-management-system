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
        System.out.println(depositAmount + " Deposited successfully");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();

    }

    @Override
    public void viewMiniStatement() {

    }
}

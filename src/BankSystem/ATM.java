package BankSystem;

public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawnAmount;

    /* Default constructor */
    ATM(){

    }

    /* Getters and setters */

//    balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//    depositAmount
    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

//    withdrawnAmount
    public double getWithdrawnAmount() {
        return withdrawnAmount;
    }

    public void setWithdrawnAmount(double withdrawnAmount) {
        this.withdrawnAmount = withdrawnAmount;
    }
}

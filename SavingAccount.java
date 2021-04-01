/**
 * Copyright (c) Bournemouth University
 * 
 * @author Ahmed El-Atreby
 * 
 * @version 1.0
 */

// This is the child class Saving Account extends from Account class

public class SavingAccount extends Account {

    public SavingAccount(String accountName, String accountNumber) {
        super(accountName, accountNumber);
        this.accountType = AccountType.CHECKING_ACCOUNT;
    }

    /**
     * Method to add 10% interest to saving account
     * 
     * @return double
     */
    public double addInterest() {
        deposit(this.getAccountBalance() * 0.1);
        return balance;
    }

    /**
     * Method for saving account unable to withdraw money
     * 
     * @param money
     * @return boolean
     */
    @Override
    public boolean canWithdraw(double money) {
        if (money < 0) {
            System.err.println("Unable to complete transection due to insufficient credit");
            return false;
        } else {
            return true;
        }

    }

    /**
     * @param balance
     * @return double
     */
    @Override
    public double setAccountBalance(double balance) {
        return 0;
    }

}

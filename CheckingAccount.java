/**
 * Copyright (c) Bournemouth University
 * 
 * @author Ahmed El-Atreby
 * 
 * @version 1.0
 */

// This is the child class Checking Account extends from Account class
public class CheckingAccount extends Account {

    protected CheckingAccount(String accountName, String accountNumber) {
        super(accountName, accountNumber);
        this.accountType = AccountType.CHECKING_ACCOUNT;
    }

    /**
     * set a limet for the amount user can withdraw to £5000
     * 
     * @param money
     * @return boolean
     */
    @Override
    protected boolean canWithdraw(double money) {
        if (money > -5000) {
            return true;
        } else {
            System.out.println("Unable to complete transection due to insufficient credit");
            return false;
        }
    }

    /**
     * create a methos checking account can overdrawn
     * 
     * @return String
     */

    public String overdrwan() {
        if (this.getAccountBalance() < 0) {
            return String.format("You are £%.2f overdrawn", this.getAccountBalance() * -1);
        } else {
            return "you are not overdrwan";
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
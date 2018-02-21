import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    private int accountNumber;
    /**
     *
     */
    public BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    public double interestRate;
    /**
     *
     */
    private double interestEarned;
    /**
     *
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
    }
    /**
     *
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     *
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     *
     */
    public String getOwnerName() {
        return ownerName;
    }
    /**
     *
     */
    public double getInterestEarned() {
        return interestEarned;
    }
    /**
     *@param a new balance
     */
    public void setAccountBalance(final double a) {
        accountBalance = a;
    }
    /**
     * @param a new name
     */
    public void setOwnerName(final String a) {
        ownerName = a;
    }
}
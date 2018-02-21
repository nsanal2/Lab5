import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {
    /**
     *
     */
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
    private BankAccountType accountType;
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
    private double interestRate;
    /**
     *
     */
    private double interestEarned;
    /**
     * @param name owner name
     * @param accountCategory type of account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        accountNumber = (new Random()).nextInt();
    }
    /**
     *@return account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     *@return acccount balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     *@return ownername
     */
    public String getOwnerName() {
        return ownerName;
    }
    /**
     *@return interest
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
    /**
     *@return ownername
     */
    public BankAccountType getAccountType() {
        return accountType;
    }
    /**
     *@return interest
     */
    public double getInterestRate() {
        return interestRate;
    }
}

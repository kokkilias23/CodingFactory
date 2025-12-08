package gr.aueb.cf.cf9.ch11;

public class Account {
    private long id;
    private String  iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account(){
    }

    public Account(long id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws Exception {
        try {
            if (amount < 0) throw new Exception("The amount should be positive.");
            balance += amount;
            // log
        }   catch (Exception e) {
            System.err.println("Negatice amount = " + amount + " is not allowed.");
            throw e;
        }
    }

    /**
     * Withdraws the specifies amount of money from this account.
     *
     * @param amount tha amount of money to withdraw.
     * @param ssn the SSN of the account holder
     * @throws Exception if the amount is negatice, the balance is insufficient,
     *                   or the SSN does not match.
     */
    public void withdraw (double amount, String ssn) throws Exception {
        try {
            if (amount < 0 )throw new Exception("The amount must be positive");
            if (amount > balance ) throw new Exception("The balance is insufficient");
            if (!ssn.equals(this.ssn)) throw new Exception("The SSN does not match");
            balance -= amount;
        }   catch (Exception e) {

        }
    }

    /**
     *  Returns the current balance of the account.
     * @return the current balance of the account.
     */
    public double getAccountBalance() {
        return getBalance();
    }

    /**
     * Returns the state of the account as a string.
     * @return the string representation of the {@link Account } object.
     */
    public String accountToString() {
        return "Account Id: " + id + " IBAN: " + iban + " Firstname: " + firstname +
                "Lastname: " + lastname + " SSN: " + ssn + " Balance: " + balance;
    }
}

public class BankAccount implements Cloneable{ //this how to use Prototype pattern

    private Long accountId;
    private double balance;
    private AccountType type;
    private Customer customer;

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", type=" + type +
                ", customer=" + customer +
                '}';
    }

    //and we need to override this methode to use it in Main
    @Override
    protected BankAccount clone() throws CloneNotSupportedException {
        BankAccount bankAccount= (BankAccount) super.clone();
        bankAccount.setCustomer(this.customer.clone());
        return bankAccount;
    }
}

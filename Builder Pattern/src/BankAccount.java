public class BankAccount {

    private Long accountId;
    private double balance;
    private AccountType type;

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", type=" + type +
                '}';
    }

    //Builder Pattern
    public static AccountBuilder Builder(){
        return new AccountBuilder();
    }

    public static class AccountBuilder{
        private BankAccount bankAccount =new BankAccount();
        public AccountBuilder accountId(Long id){
            bankAccount.accountId=id;
            return this;
        }
        public AccountBuilder balance(double balance){
            bankAccount.balance=balance;
            return this;
        }
        public AccountBuilder type(AccountType type){
            bankAccount.type=type;
            return this;
        }

        public BankAccount build(){
            return this.bankAccount;
        }
    }

}

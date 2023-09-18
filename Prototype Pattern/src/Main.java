public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Customer customer=new Customer(1L,"Ayoub");
        BankAccount account1=new BankAccount();
        account1.setAccountId(1L);
        account1.setBalance(1000);
        account1.setType(AccountType.CURRENT_ACCOUNT);
        account1.setCustomer(customer);

        //create another object with same values as account1
        BankAccount account2=account1.clone();
        account2.getCustomer().setName("Hamid");
        System.out.println(account1);
        System.out.println(account2);
    }
}
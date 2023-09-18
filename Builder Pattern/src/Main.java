public class Main {
    public static void main(String[] args) {
        //look how now we can create this object using Builder Pattern
        BankAccount bankAccount=BankAccount.Builder()
                .accountId(1L)
                .balance(7000)
                .type(AccountType.CURRENT_ACCOUNT)
                .build();

        System.out.println(bankAccount.toString());
    }

}
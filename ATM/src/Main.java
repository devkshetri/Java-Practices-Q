public class Main {

    public static void main(String[] args) {

        // Create account
        BankAccount myAccount = new BankAccount(100.0);

        System.out.println("Starting Balance: $" + myAccount.getBalance());

        // Negative number
        System.out.println("\nAttempting to withdraw -$20");
        myAccount.withdraw(-20.0);

        // Too much money
        System.out.println("\nAttempting to withdraw $500");
        myAccount.withdraw(500.0);

        // Valid withdrawal
        System.out.println("\nAttempting to withdraw $40");
        myAccount.withdraw(40.0);

        System.out.println("Final Balance: $" + myAccount.getBalance());
    }
}

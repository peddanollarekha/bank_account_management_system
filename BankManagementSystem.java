public class BankManagementSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Creating accounts
        Account acc1 = new SavingsAccount("123456", "Alice", 5000, 3.5);
        Account acc2 = new CurrentAccount("789012", "Bob", 2000, 1000);
        Account acc3 = new SavingsAccount("345678", "Charlie", 3000, 2.5);

        // Adding accounts to the bank
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        // Performing transactions
        acc1.deposit(1500);
        acc2.withdraw(2500);  // This should use the overdraft limit
        acc3.withdraw(1000);

        // Adding interest to savings account
        if (acc1 instanceof SavingsAccount) {
            ((SavingsAccount) acc1).addInterest();
        }

        // Listing all accounts
        bank.listAccounts();
    }
}

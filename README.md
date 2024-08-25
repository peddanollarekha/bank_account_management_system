BankAccount Class:

This is the base class for all types of bank accounts. It contains attributes such as accountNumber, accountHolderName, and balance.
Provides basic functionalities like deposit, withdraw, and displayAccountDetails.
SavingsAccount Class:

Extends BankAccount to include specific features for savings accounts, such as an interest rate and a method to apply interest to the balance.
CurrentAccount Class:

Extends BankAccount and adds an overdraft limit feature.
Overrides the withdraw method to account for overdrafts.
Bank Class:

Manages a collection of BankAccount objects.
Provides methods to add and remove accounts, deposit to and withdraw from accounts, and display account details.
BankManagementSystem (Main Class):

Demonstrates the functionality of the Bank Account Management System by creating instances of SavingsAccount and CurrentAccount, performing operations like deposit, withdrawal, and displaying account details.

class BankAccount {

    int balance = 0;

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(int amount) {
        balance = balance - amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Balance: " + balance);
    }

    public static void main(String args[]) {
        SavingsAccount s = new SavingsAccount();

        s.deposit(1000);
        s.withdraw(500);
        s.withdraw(450);
    }
}

class SavingsAccount extends BankAccount {

    void withdraw(int amount) {
        if (balance - amount >= 100) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Withdrawal not allowed");
            System.out.println("Balance must be at least 100");
        }
    }
}
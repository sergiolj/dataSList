package list1.tadExerc.tad;

import list1.tadExerc.interfaces.Account;

public class BankAccount<T> implements Account<T> {
    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public boolean deposit(double amount) {
        return false;
    }

    @Override
    public double withdraw(double amount) {
        return amount;
    }

    @Override
    public void update() {

    }
}

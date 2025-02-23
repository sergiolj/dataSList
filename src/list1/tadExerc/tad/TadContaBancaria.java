package list1.tadExerc.tad;

import list1.tadExerc.interfaces.IAccount;

public class TadContaBancaria <T> implements IAccount<T> {
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

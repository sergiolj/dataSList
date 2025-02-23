package list1.tadExerc.interfaces;

public interface IAccount <T> {
    double getBalance();
    boolean deposit(double amount);
    double withdraw(double amount);
    void update();
}

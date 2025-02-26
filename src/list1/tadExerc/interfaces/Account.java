package list1.tadExerc.interfaces;

public interface Account <T> {
    double getBalance();
    boolean deposit(double amount);
    double withdraw(double amount);
    void update();
}

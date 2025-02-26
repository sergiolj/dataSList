package list1.tadExerc.models;

public abstract class Account <T>{
    private final T client;
    private final String accountNumber;

    public Account(T client, String accountNumber) {
        this.client = client;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "client=" + client +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}

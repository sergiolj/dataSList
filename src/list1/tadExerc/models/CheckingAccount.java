package list1.tadExerc.models;

public class CheckingAccount {
    private Client client;
    private String accountNumber;

    public CheckingAccount(Client client, String accountNumber) {
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

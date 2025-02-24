package list1.tadExerc.models;

public class CheckingAccount {
    private NaturalPerson client;
    private String accountNumber;

    public CheckingAccount(NaturalPerson client, String accountNumber) {
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

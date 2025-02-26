package list1.tadExerc.models;

public class CheckingAccount <T> extends Account <T>{

    public CheckingAccount(T client, String accountNumber) {
        super(client, accountNumber);
    }
}

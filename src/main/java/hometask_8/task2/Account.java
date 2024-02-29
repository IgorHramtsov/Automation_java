package hometask_8.task2;

public class Account {
    public String account;

    public Account(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account='" + account + '\'' +
                '}';
    }
}
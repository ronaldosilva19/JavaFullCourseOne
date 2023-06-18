package Interface.Banco;

public class Account {
    private String OwnerName;
    private int account;
    private double balance;

    public void setAccount(int account){
        this.account = account;
    }

    public int getAccount() {
        return this.account;
    }

    public void setOwnerName(String ownerName) {
        this.OwnerName = ownerName;
    }

    public String getOwnerName() {
        return this.OwnerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }
}

package Interface.Banco;

import java.lang.reflect.AccessibleObject;

public class BankInter implements Bank{
    private Account AccountBankInter;

    BankInter(){
        this.AccountBankInter = new Account();
        this.AccountBankInter.setOwnerName("Polina");
        this.AccountBankInter.setAccount(10754);
        this.AccountBankInter.setBalance(1965.99);
    }
    @Override
    public void Maintenance(Account account) {
        double NewValue = account.getBalance() - 0.01;
        account.setBalance(NewValue);

        double BankBalance = this.AccountBankInter.getBalance() + 0.01;
        this.AccountBankInter.setBalance(BankBalance);
    }

    @Override
    public boolean Withdraw(Account account, double value) {
        if(account.getBalance() >= value){
            double NewValue = account.getBalance() - value;
            account.setBalance(NewValue);
            System.out.println("Withdraw made.");
            Maintenance(account);
            return true;
        }else{
            System.out.println("Failed to withdraw!");
            Extract(account);
        }
        return false;
    }

    @Override
    public void Extract(Account account) {
        System.out.println("\n-- BANK INTER -- \n");
        System.out.println("->ACCOUNT EXTRACT\n");
        System.out.println("Name: " + account.getOwnerName());
        System.out.println("Account: " + account.getAccount());
        System.out.println("Withdraw: " + account.getBalance());
        System.out.println("\n---------------------------------\n");
    }

    @Override
    public boolean Deposit(Account account, double value) {
        double NewValue = account.getBalance() + value;
        account.setBalance(NewValue);
        System.out.println("Deposit made!");
        Maintenance(account);
        return true;
    }
}

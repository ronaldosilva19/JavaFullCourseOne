package Interface.Banco;

public class BankBrazil implements Bank{
    private Account AccountBankBrazil;

    BankBrazil(){
        this.AccountBankBrazil = new Account();
        this.AccountBankBrazil.setOwnerName("Ronaldo");
        this.AccountBankBrazil.setAccount(665495);
        this.AccountBankBrazil.setBalance(1750.5);
    }

    @Override
    public void Maintenance(Account account) {
        boolean IsBalance = account.getBalance() >= 0.25;

        if(IsBalance){
            double NewBalance = account.getBalance() - 0.25;
            Deposit(this.AccountBankBrazil, 0.25);
        }else{
            System.out.println("Unable to charge account maintenance"
            + account.getAccount() + "!!!");
        }
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
    public boolean Deposit(Account account, double value) {
        double NewValue = account.getBalance() + value;
        account.setBalance(NewValue);
        System.out.println("Deposit made!");
        return true;
    }

    @Override
    public void Extract(Account account) {
        System.out.println("\n-- BANK BRAZIL -- \n");
        System.out.println("->ACCOUNT EXTRACT\n");
        System.out.println("Name: " + account.getOwnerName());
        System.out.println("Account: " + account.getAccount());
        System.out.println("Withdraw: " + account.getBalance());
        System.out.println("\n---------------------------------\n");
    }

    boolean Transfer(Account sourceAccount, Account destinyAccount, double value){
        boolean MadeWithdraw = Withdraw(sourceAccount, value);
        if(MadeWithdraw){
            Deposit(destinyAccount, value);
            System.out.println("Transfer Made.");
            return true;
        }else{
            System.out.println("Failed to transfer.");
            return false;
        }
    }
}

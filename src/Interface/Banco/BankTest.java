package Interface.Banco;

import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
        Bank bankBrazil = new BankBrazil();
        Account account = new Account();
        account.setOwnerName("Ronaldo");
        account.setAccount(66595);
        account.setBalance(1765.9);

        bankBrazil.Deposit(account, 150.5);
        bankBrazil.Withdraw(account, 500);
        bankBrazil.Extract(account);

        Bank bankInter = new BankInter();
        Account account1 = new Account();
        account1.setOwnerName("Polina");
        account1.setAccount(10795);
        account1.setBalance(1975.99);

        bankInter.Deposit(account1, 40.99);
        bankInter.Withdraw(account1, 300);
        bankInter.Extract(account1);

        BankBrazil bankBrazil1 = new BankBrazil();
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if(bankBrazil1.Transfer(account, account1, value)){
            System.out.println("OK");
        }else{
            System.out.println("Failed!");
        }
    }
}

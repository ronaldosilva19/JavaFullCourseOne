package Class.Math.ExampleTwo;

/**
 * @author Jose Ronaldo da Silva
 */
public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1000, "Chain");
        Account account1 = new Account(1000, "Savings");

        account.Deposit(1500);
        account1.Deposit(1500);
        account1.Deposit(98.52);
        account1.Draw(1001);

        account.Transfer(account1, 1800);
        account1.Transfer(account, 700);
        account1.Draw(1000);
        account.Draw(1001);
    }
}

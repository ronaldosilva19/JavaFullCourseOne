package Interface.Banco;

/**
* Interface used to represent the minimum methods that
* banks need to implement.
 */
public interface Bank {
    void Maintenance(Account account);
    boolean Withdraw(Account account, double value);
    boolean Deposit(Account account, double value);
    void Extract(Account account);

}

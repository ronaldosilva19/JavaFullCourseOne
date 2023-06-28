package Class.Math.ExampleTwo;

/**
 * @author Jose Ronaldo da Silva
 */
public class Account {
    private double balance;
    private String type;
    Account(double initialValue){
    }
    public Account(double initialValue, String type){
        this.balance = initialValue;
        this.type = type;
    }
    public boolean Deposit(double value){
        if(value <= 0){
            System.out.println("It is not possible to deposit a negative or zero amount.");
            return false;
        }
        if(value >= 1000.0){
            if(this.type.equals("Chain")){
                System.out.println("it is not possible to deposit, as the value is greater " +
                        "than or equal to one thousand and the account is of the current type.");
                return false;
            }else if(this.type.equals("Savings")){
                this.balance += value;
                System.out.println("Deposit made.");
                return true;
            }
        }else{
            this.balance += value;
        }
        System.out.println("Deposit made..");
        return true;
    }
    public boolean Draw(double value){
        if(this.balance < value){
            System.out.println("Not possible.Desired amount for withdrawal " +
                    "greater than the account balance. ");
            return false;
        }
        this.balance -= value;
        System.out.println("Draw made.");
        return true;
    }
    public boolean Transfer(Account accountDestiny, double value){
        if(accountDestiny.type.equals("Savings")){
            if(this.balance >= value) {
                accountDestiny.balance += value;
                System.out.println("Transfer made.");
                return true;
            }else{
                System.out.println("Desired amount for transfer " +
                        "greater than the account balance.");
                return false;
            }
        }
        System.out.println("Transfer not possible.");
        return false;
    }
}

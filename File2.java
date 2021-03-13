public class Main {

    public static void main(String[] args) {

        AccountManager manager = new AccountManager();
        System.out.println("Hesap bakiye:"+manager.getBalance());
        manager.deposit(100);
        System.out.println("Hesap bakiye:"+manager.getBalance());
        try {
            manager.withdraw(90);
        } catch (BalanceInsufficentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap bakiye:"+manager.getBalance());
        try {
            manager.withdraw(90);
        } catch (BalanceInsufficentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap bakiye:"+manager.getBalance());


    }
}
//////////////////////////////////////////////////
public class AccountManager {

    private double balance;

    public void deposit(double amount){

        balance = getBalance() + amount;

    }
    public  void  withdraw(double amount) throws BalanceInsufficentException {
        if(balance>=amount)
        balance = getBalance() - amount;
        else throw new BalanceInsufficentException("Yetersiz bakiye");
    }


    public double getBalance() {
        return balance;
    }
}
//////////////////////////////////////////////////////////////////
public class BalanceInsufficentException extends Exception {
    String message;
    public BalanceInsufficentException(String message){
        this.message=message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}

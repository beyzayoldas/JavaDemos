
public class Main {
    public static void main(String[] args)  {

        AccountManager manager=new AccountManager();
        System.out.println("Hesap: "+manager.getBalance());
        manager.deposit(1000);
        System.out.println("Hesap: "+manager.getBalance());
        try {
            manager.withdraw(100);
        }catch(BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap: "+manager.getBalance());
        try {
            manager.withdraw(1000);
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap: "+manager.getBalance());

    }
}
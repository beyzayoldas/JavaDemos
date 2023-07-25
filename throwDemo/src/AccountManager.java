public class AccountManager {
   private double balance;

   public void deposit(double amount){
       balance = getBalance() + amount;
   }

   public void withdraw(double amount) throws BalanceInsufficentException {
       if (balance >= amount) {
           balance = getBalance() - amount;
       } else {
           throw new BalanceInsufficentException("Bakiye Yetersiz!");
           //System.out.println("Hesaptan para çekilemez.Bakiye yetersiz.");
       }
   }


    public double getBalance() { //hesaptaki parayı okumamızı sağlar!
        return balance;
    }
}

public class AccountManager {
    private double balance;

    public void deposit(double amount){ //para yatırma
        balance = getBalance() + amount;
    }

    public void  withdraw(double amount) throws Exception { //para çekme
        if(balance>=amount){
            balance = getBalance() - amount;
        }else{
            throw new Exception("Bakiye yetersiz");
        }

    }
    public double getBalance() {
        return balance;
    }
}

import java.util.Objects;
import java.util.UUID;

public class sbiuser implements BanKInterface{
    private String name;
    private String accountno;
    private double balance;
   private  String password;
    private static double rateofInterest;

    public sbiuser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rateofInterest=6.5;
        this.accountno= String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateofInterest() {
        return rateofInterest;
    }

    public static void setRateofInterest(double rateofInterest) {
        sbiuser.rateofInterest = rateofInterest;
    }

    @Override
    public double checkbalance() {
        return balance;
    }

    @Override
    public String addMoney(int ammount) {
        balance=balance+ammount;
        return "money sucessfully added"+balance;
    }

    @Override
    public String WithdrawMoney(int ammount, String enterpassword) {
        if(Objects.equals(enterpassword,password)){
            if(ammount>balance){
                return "sorry bro ! infussiant fund";
            }
            else{
                balance=balance-ammount;
                return "paisa hi paisa";
            }

        }
        else{
            return "wrong password";
        }
    }

    @Override
    public double calculateInterest(int year) {
       return  (balance+year+rateofInterest)/100;
    }
}

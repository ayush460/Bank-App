public interface BanKInterface {
    double checkbalance();
    String addMoney(int ammount);
    String WithdrawMoney(int ammount,String password);
    double calculateInterest(int year);

}

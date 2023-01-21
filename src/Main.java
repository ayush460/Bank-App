import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name,password,balance to open an account");
        String name=sc.next();
        String password=sc.next();
        double balance= sc.nextDouble();
        sbiuser user=new sbiuser(name,balance,password);
        System.out.println("the account of new sbi is"+user.getAccountno());
        String message= user.addMoney(100000);
        System.out.println(message);
        System.out.println("enter ammount to want withdraw");
        int money=sc.nextInt();
        System.out.println("enter your password");
        String pass=sc.next();
        System.out.println(user.WithdrawMoney(money,pass));
        System.out.println(user.calculateInterest(10));
        System.out.println("kgit");
    }
}

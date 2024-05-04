import java.util.Scanner;
class Atm{
    double Balance;
    Atm(double balance){
        this.Balance = balance;
    }
    public void withdraw(double balance){
        if(this.Balance >= balance){
                 this.Balance =- balance;

        }
        else{
            System.out.println("YOU CAN'T WITHDRAW :+ \n +  BALANCE MUST BE GREATER THAN WITHDRWAING AMOUNT");

        }

        System.out.println("Total Balance after withdraw :" + this.Balance);
        System.out.println("withdraw Amount :" + balance);
    }
    public  void deposit(double balance){
            this.Balance+=balance;
    }
    public void checkBalance(){
        System.out.println("Balance is :" + this.Balance);
    }
}


public class Atm_Machine {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Atm A1 = new Atm(2000.0);
        System.out.println("1 : withdraw" );
        System.out.println("2 : for deposit");
        System.out.println("3 : for checking balance");
        System.out.println("Enter choice :");
        int ch = Sc.nextInt();
        switch(ch) {
            case 1:
                System.out.println("WITHDRAW :");
                System.out.println("Enter Amount you want to withdraw :");
                double Amount = Sc.nextInt();
                A1.withdraw(Amount);
                break;
            case 2:
                System.out.println("Deposite :");
                System.out.println("Enter Amount you want to Deposit  :");
                double Amountt = Sc.nextInt();
                A1.deposit(Amountt);
                break;
            case 3:
                System.out.println("Check Balance :");
                A1.checkBalance();
                break;
            default:
                System.out.println("INVALID :");
        }

    }
}

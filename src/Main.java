import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("In Which Bank You Want To Open your Account");
        System.out.println("Press 1 For SBI Bank OtherWise Press 2 For Hdfc Bank");
        int decide = sc.nextInt();

        if(decide == 1) {
            System.out.println("Enter your Name,Password and Intitial Balance For Open Account In SBI Bank");
            String name = sc.next();
            String password = sc.next();
            int balance = sc.nextInt();

            SBIBank sbiBank = new SBIBank(name, balance, password);

            System.out.println("Your Account Has Been Created With Account Number: " + sbiBank.getAccountNo());

            //getBalance.
            System.out.println("Your Current Balance is: " + sbiBank.getBalance());

            //DepositMoney
            System.out.println(sbiBank.depositMoney(500));
            System.out.println("New Balance is: " + sbiBank.getBalance());

            //withdraaw.
            System.out.println("Enter Amount to be Withdrawn");
            int amount = sc.nextInt();
            System.out.println("Enter The Password");
            String pwd = sc.next();
            System.out.println(sbiBank.withdraw(amount, pwd));

            //Interest.
            System.out.println("Interest On Current Balance -->" + sbiBank.getBalance() + " Is --> " + sbiBank.calculateInterest(4));
        }
        else if(decide == 2){
            System.out.println("Enter your Name,Password and Intitial Balance For Open Account In HDFC Bank");
            String name = sc.next();
            String password = sc.next();
            int balance = sc.nextInt();

            HDFCBank hdfcBank = new HDFCBank(name, balance, password);

            System.out.println("Your Account Has Been Created With Account Number: " + hdfcBank.getAccountNo());

            //getBalance.
            System.out.println("Your Current Balance is: " + hdfcBank.getBalance());

            //DepositMoney
            System.out.println(hdfcBank.depositMoney(500));
            System.out.println("New Balance is: " + hdfcBank.getBalance());

            //withdraaw.
            System.out.println("Enter Amount to be Withdrawn");
            int amount = sc.nextInt();
            System.out.println("Enter The Password");
            String pwd = sc.next();
            System.out.println(hdfcBank.withdraw(amount, pwd));

            //Interest.
            System.out.println("Interest On Current Balance -->" + hdfcBank.getBalance() + " Is --> " + hdfcBank.calculateInterest(4));
        }
        else System.out.println("Your Enter Wrong No Please Enter Again.");
    }
}
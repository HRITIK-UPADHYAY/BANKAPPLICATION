import java.util.UUID;

public class SBIBank implements BankInteface{
    private String name;
    private String accountNo;
    private int balance;
    private String password;
    private double ROI;

    public SBIBank(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.ROI = 6.6;
        this.accountNo = String.valueOf(UUID.randomUUID());
        //(UUID)-> universally unique identify which is genrate the unique no everytime.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getROI() {
        return ROI;
    }

    public void setROI(double ROI) {
        this.ROI = ROI;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance += amount;
        return "Paisa hi Paisa AA Gya In SBI Account --> " + amount;
    }

    @Override
    public String withdraw(int amount, String enteredPassword) {
        if(password.equals(enteredPassword)) {
            if (balance < amount) return "Bhai Jitna Ap Chahte Ho Utna Nhi Hai";

            balance -= amount;
            return "Itna Paisa nikala gya --> " + amount;
        }

        return "Yeh Sab Doglapan Hai In SBI Account";
    }

    @Override
    public double calculateInterest(int time) {
        return (balance * ROI * time)/100.0;
    }
}

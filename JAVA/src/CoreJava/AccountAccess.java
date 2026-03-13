package CoreJava;

public class AccountAccess {

    private double balance = 5000;        // private
    protected String accountHolder;       // protected
    int accountNumber = 101;              // default
    public String bankName = "ABC Bank";  // public


    // Setter for private variable
    public void setBalance(double balance){
        this.balance = balance;
    }

    // Getter for private variable
    public double getBalance(){
        return balance;
    }

    // public method
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // protected method
    protected void withdraw(double amount){

        if(amount > balance)
            System.out.println("Insufficient balance");
        else{
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // default method
    void showAccountDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Bank: " + bankName);
    }

    public static void main(String[] args){

        AccountAccess a = new AccountAccess();

        a.accountHolder = "Rahul";

        a.setBalance(10000);   // using setter

        a.deposit(2000);
        a.withdraw(3000);

        a.showAccountDetails();

        System.out.println("Balance: " + a.getBalance());
    }
}
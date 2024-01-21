package ATM_project;


class Account{
    private double balance;

    public Account(){
        balance = 0.00;
    }

    public void depositAmount(double amount){
        balance += amount;
        System.out.println(balance);
    }

    public void withdrawAmount(double amount){
        balance -= amount;
        System.out.println("Balance is " + balance);
    }
    
    public double getBalance(){
        return balance;
    }
}
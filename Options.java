package ATM_project;



import java.util.Scanner;


class Options extends Account {

    public void showOptions(){
        System.out.println("1. View Balance");
        System.out.println("2. Cash Withdraw");
        System.out.println("3. Money Deposit");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();


        switch (choice) {
            case 1:
                System.out.println("Balance: " + getBalance());
                break;

            case 2:
                System.out.println("Enter amount to withdraw:");
                int amountToWithdraw = scan.nextInt();
                withdrawAmount(amountToWithdraw);
                System.out.println("Withdrawal successful.");
                break;

            case 3:
                System.out.println("Enter amount to deposit:");
                int amountToDeposit = scan.nextInt();
                depositAmount(amountToDeposit);
                System.out.println("Deposit successful.");
                break;
                
            default:
                System.out.println("Invalid choice.");
                break;
        }
        scan.close();

    }  
}

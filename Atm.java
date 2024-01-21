package ATM_project;




import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        //set some accounts deails
        Map<Integer, Integer> details = new HashMap<>();
        details.put(9999, 1234);
        details.put(8888, 5678);

        // Ask for atm card number
        System.out.println("Enter your Atm Card Number");
        Scanner scan = new Scanner(System.in);
        int cardNumber = scan.nextInt();

        // Check the atm number matches the stored details
        boolean checkCardNumber = details.containsKey(cardNumber);

        if(checkCardNumber){

            //Ask for atm pin number.
            System.out.println("Enter PIN");
            int pinNumber = scan.nextInt();

            //check pin number
            boolean checkPinNumber = details.get(cardNumber) == pinNumber;
            if(checkPinNumber){
                Options optionsMenu = new Options();
                optionsMenu.showOptions();
            }   
            else{
            System.out.println("Wrong PIN!!");
            }
        }
        else{
        System.out.println("Wrong Number");
        }
        scan.close();
    }  
}
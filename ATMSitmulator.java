import java.util.*;
import java.util.Scanner;

public class ATMSitmulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 5000; //intial balnace

        while(true){

        System.out.println("<-----ATM Menu ----->");
        System.out.println("(1) Check Balance");
        System.out.println("(2) Withdraw Money");
        System.out.println("(3) Deposite Money");
        System.out.println("(4) Exit");
        System.out.println("Choose an option :");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your balance is " + balance + "Rs. only");
                break;

                case 2:
                System.out.print("Enter the withdraw money = ");
                int WithdrawMoney = scanner.nextInt();
                if (WithdrawMoney > balance ){
                    System.out.println("Insufficient amonut in the bank");
                }
                else{
                    balance -= WithdrawMoney;
                    System.out.println(WithdrawMoney + " Rs " + " has withdrawn Successfully!");
                }
                break;

                case 3:
                System.out.print("Enter the Deposite money = ");
                int DepositeMoney = scanner.nextInt();
                
                    balance += DepositeMoney;
                    System.out.println(DepositeMoney + " Rs " + " has been Deposited Successfully!");
                break;

                case 4:
                System.out.println("Thanks for using ATM.....Good Bye!!!");
        
            default:
                break; }
            }

    }
    
}

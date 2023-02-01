package org.example;

import java.util.Scanner;

class ATM{
    float balance;
    int pin = 1234;


    public void checkPin(){
        System.out.println("ENTER YOUR PIN: ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if(pin == enteredPin){
            menu();
        }
        else {
            System.out.println("Enter a valid pin");
        }
    }
    public void menu(){
        System.out.println("Enter your  choice: ");
        System.out.println("1. Check Bank Balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money into your account");
        System.out.println("4: EXIT");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if(choice == 1){
            fetchBalance();
            menu();
        }
        else if(choice == 2){
            withdraw();
            menu();
        }
        else if(choice == 3){
            deposit();
            menu();
        }
        else if(choice == 4){
        }
        else System.out.println("Enter a valid choice");

    }
    public void fetchBalance(){
        System.out.println("Current Balance is: " + balance);
    }
    public void withdraw(){
        System.out.println("Enter the amount to be withdrawn: ");
        Scanner sc = new Scanner(System.in);
        float amt = sc.nextInt();
        if(amt>balance){
            System.out.println("Insufficient funds");
        }
        else {
            System.out.println("Processing");
            balance-=amt;
            System.out.println("Transaction Successful. Amount remaining: "+ balance);
        }
    }
    public void deposit(){
        System.out.println("Enter the amount to be deposited: ");
        Scanner sc = new Scanner(System.in);
        float amt = sc.nextInt();
        System.out.println("Processing...");
        balance+=amt;
        System.out.println("Transaction Successful. Updated Balance is: "+ balance);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello user. Enter your ATM pin: ");
        ATM obj = new ATM();
        obj.checkPin();
    }
}
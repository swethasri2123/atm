import java.util.Scanner;


public class Atm {
	
	public static void main(String args[] )  
    {  
        //declare and initialize balance, withdraw, and deposit  
        int balance = 100000, withdraw, deposit;
        int pin = 1234;
          
        //create scanner class object to get choice of user  
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("WELCOME TO THE BANK");
        
        System.out.println("enter your pin");
		int entry = sc.nextInt();
		while(entry != pin)
		{
			System.out.println("\nincorrect pin.try again");
			System.out.println("enter your pin");
			entry = sc.nextInt();
		}
		System.out.println("\npin accepted.you has acess");

          
        while(true)  
        {  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
            //get choice from user  
            int choice = sc.nextInt();  
            switch(choice)  
            {
            	case 1:
            		
            		System.out.print("Enter money to be withdrawn:");  
                      
        //get the withdrawl money from user  
        withdraw = sc.nextInt();  
                      
        //check whether the balance is greater than or equal to the withdrawal amount  
        if(balance >= withdraw)  
        {  
            //remove the withdraw amount from the total balance  
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {  
            //show custom error message   
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
        //get deposite amount from te user  
        deposit = sc.nextInt();  
                      
        //add the deposit amount to the total balanace  
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
                case 3:  
        //displaying the total balance of the user  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:  
        //exit from the menu  
        System.exit(0);  
            }  
        }  
    }  

}

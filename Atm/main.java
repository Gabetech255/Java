
import java.util.Scanner;

public class main {
	
	public static void main(String[] args){
		
		Scanner userinput = new Scanner(System.in);
		
		int withdrawl, deposit; //menu variable r = return 
		int acc1[] = new int[1]; // initializes the array
		acc1[0] = 50; //sets the first memory slot in the array equal to 50
		
		System.out.println("\n			Welcome to the Weird ATM\nMain Menu\n");
		
		
		for (int r = 0; r != 4; System.out.printf("Main Menu\n")){ //runs unit the user enters 4 meaning exit; instead of increment it runs a function
			
			System.out.println("1.Make a Withdrawl\n2.Make a deposit\n3.Make a new account\n4.Exit");
			r = userinput.nextInt();
			
			if (r == 1){ //Withdraw
				
				int a = 0;
				
				System.out.println("How much would you like to withdraw");
				a = userinput.nextInt();
				acc1[0] = acc1[0] - a;
				
				System.out.println("Your new balance is " + acc1[0]);
				System.out.println("Have a nice day");
				break;
				
			}
			
			else if (r == 2){ //Deposit
				
				int a = 0;
				
				System.out.println("How much would you like to deposit");
				a = userinput.nextInt();
				acc1[0] = acc1[0] + a;
				
				System.out.println("Your new balance is " + acc1[0]);
				System.out.println("Have a nice day");
				break;
				
			}
			else if (r == 3){ //New Account
				int acc2[] = new int[1];
				System.out.println("What is your stating balance ");
				acc2[0] = userinput.nextInt();
				System.out.println("You are now account num 2 and your balance is " + acc2[0] + "\nHave a nice day\nGOOD BYE");
				break;
			}
			else if (r == 4){ //Exit; this will break the loop ensuring the menu heading isnt printed again.
				break;
			}
		}
		
		System.out.println("The program and loop worked apparently");
	}

}

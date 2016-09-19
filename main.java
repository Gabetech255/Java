import java.util.Scanner;

import javax.swing.JOptionPane;


public class main {
	
	public static void main(String[] args){
		
		//loop assist variables
		int x,y =0,z;
		
		//Create your user input scanner 
		Scanner userinput = new Scanner(System.in);
		
		for (x = 0; x != 1; y++){
			//Open the gui and ask for the clients name
			String uName = JOptionPane.showInputDialog("\tGabes Health App Version 1.0\nPlease enter your name");
			String weight = JOptionPane.showInputDialog("What is your weight?");
			
			//transform the string into an int
			int weighttran = Integer.parseInt(weight);
			
			String message = String.format("Your name is %s and your weigh %d", uName, weighttran);
			JOptionPane.showMessageDialog(null, message);
			
			//enter 1 to end the program
			String end = JOptionPane.showInputDialog("Do you want to exit?\n 0 for no. 1 for yes.");
			int endtran = Integer.parseInt(end);
			
			if (endtran == 1){
				JOptionPane.showMessageDialog(null, "Thats the end of the program");
				break;
			}
		
		}
		
	}

}

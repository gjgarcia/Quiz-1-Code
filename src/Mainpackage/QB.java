package Mainpackage;

//Gerson Jon Garcia
import java.util.Scanner;

//QB-Quarter back rating
public class QB {

	
	
	static Scanner user_input= new Scanner(System.in);

	public static void main(String[] args) {
	
		
		double Completions;
		double Yards;
		double Attempts;
		int Interceptions;
		int Touch_down;
		
		user_input = new Scanner(System.in);
		
		System.out.print("What are the number of touchdowns?: ");
		Touch_down = user_input.nextInt();
		
		System.out.print("What is the number of interceptions?: ");
		Interceptions = user_input.nextInt();
		
		System.out.print("What are the number of attepmts?: ");
		Attempts = user_input.nextInt();
		
		System.out.print("What are the number of yards?: ");
		Yards = user_input.nextDouble();
		
		System.out.print("What are the number of completions?: ");
		Completions = user_input.nextInt();
		
		
		double x;
		x = (double) ((((Completions/Attempts) * 100) - 30) * 0.05);
		System.out.println(x);
		
		double y;
		y = (double) (((Yards/Attempts) - 3) * .25);
		System.out.println(y);
		
		double z;
		z = (double) (((Touch_down/Attempts) * 100) * 0.2);
		System.out.println(z);
		
		double u;
		u = (double) (2.375 - (((Interceptions/Attempts) * 100) * 0.25));
		System.out.println(u);
		
		
		
		
		
		double Overall_rate;
		
		Overall_rate = ((x + y + z + u) / 6) * 100;
		System.out.println(x+y+z+u);
		System.out.println((x + y + z + u) / 6);
		
		System.out.print("The quarter back ratings is:  " + (Overall_rate));
		
	
		
		

}
}

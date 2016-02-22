
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		// lines 9-18 takes input from the user about the various statistics about the quarterback and stores them into the allocated space for each input
		
		System.out.printf("How many touchdowns does the quaterback have?");
		double quarterback_touchdowns = user_input.nextDouble();
		System.out.printf("How many yards does the quaterback have?");
		double quarterback_yards = user_input.nextDouble();
		System.out.printf("How many interceptions does the quaterback have?");
		double quarterback_interceptions = user_input.nextDouble();
		System.out.printf("How many completions does the quaterback have?");
		double quarterback_completions = user_input.nextDouble();
		System.out.printf("How many completion attempts does the quaterback have?");
		double quarterback_attempts = user_input.nextDouble();
		user_input.close();
		//lines 23-26 takes the user input and makes calculations that will help yield the results for the passer rating
		//the given wikipedia link refers to four equations a, b, c, and d which I will also refer to as a, b, c, d
		
		double a = ((quarterback_completions/quarterback_attempts) - .3) * 5;
		double b = ((quarterback_yards/quarterback_attempts) - 3) * .25;
		double c = (quarterback_touchdowns/quarterback_attempts) * 20;
		double d = 2.375 - ((quarterback_interceptions/quarterback_attempts) * 25);
		
		// line 30 calls the method print_results which prints the passer rating (and computes the passer rating)
		
		print_results(a,b,c,d);
	}

	// This method computes the passer rating and prints out the passer rating
	public static void print_results(double a, double b, double c, double d){
		double passer_rating = ((a + b + c + d)/6) * 100;
		System.out.printf("%.2f",passer_rating);
	}
}


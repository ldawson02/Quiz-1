package problem1;

/** This program calculates a Quarterback rating based on the following NFL formula:
 * 
 * a = (comp/att - .3) * 5
 * b = (yds/att -3) * .25
 * c = (td/att) * 20
 * d = 2.375 - (intr/att *25)
 * 
 * where:
 * 	att = number of passing attempts
 * 	comp = number of completions
 * 	yds = passing yards
 * 	td = touchdown passes
 * 	intr = interceptions
 * 
 * QB rating = ((a + b + c + d) / 6) * 100
 * 
 * This QB rating system has a range from 0 to 158.3
 * 
 * This program asks the user for the 5 key statistics of a quarterback 
 * (att, comp, yds, td, intr) and calculates and prints the QB rating.
 */
import java.util.Scanner; //import Scanner

public class QBRating {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // create new Scanner input

		System.out.print(
				"Please enter the name of the quarterback whose" + " Passer Rating you would like to calculate: \n");
		String name = input.nextLine();

		System.out.println("Please consistently answer the following questions about " + name
				+ " for either his \nentire career or a single season.\n");

		// Ask the user to input the 5 key QB statistics (att, comp, yds, td,
		// intr)
		System.out.print("How many passing attempts has " + name + " had?: \t");
		double att = input.nextDouble();
		// att = number of passing attempts

		System.out.print("How many passing completions has " + name + " had?: \t");
		double comp = input.nextDouble();
		// comp = number of passing completions

		System.out.print("How many passing yards has " + name + " thrown for?: \t");
		double yds = input.nextDouble();
		// yds = number of passing yards

		System.out.print("How many touchdown passes has " + name + " thrown?: \t");
		double td = input.nextDouble();
		// td = number of touchdowns

		System.out.print("How many interceptions has " + name + " thrown?: \t");
		double intr = input.nextDouble();
		// intr = number of interceptions

		input.close();

		// Calculate the passer rating based on the aforementioned NFL formula
		double a = (comp / att - 0.3) * 5;
		double b = (yds / att - 3.0) * 0.25;
		double c = (td / att) * 20;
		double d = 2.375 - (intr / att * 25);

		double passerRating = ((a + b + c + d) / 6) * 100;

		// Display the QB passer rating
		System.out.printf(name + " has a NFL QB Passer Rating of %3.1f", passerRating);
	}

}

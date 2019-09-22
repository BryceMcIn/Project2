import java.util.Scanner;

public class calcBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userChoice;
		Scanner in = new Scanner(System.in);
		int userWeight, userHeight, userBMI;
		
		System.out.println("How would you like to calculate BMI?");
		System.out.println("[1] Metric");
		System.out.println("[2] Customary");
		System.out.print("Choice: ");
		
		userChoice = in.nextInt();
		
		if(userChoice == 1) {
			
			System.out.print("Enter your weight in kilograms: ");
			userWeight = in.nextInt();
			System.out.print("Enter your height in meters: ");
			userHeight = in.nextInt();
			
			userBMI = (userWeight / (userHeight * userHeight));
			
			System.out.println("-----------------");
			System.out.println("Your BMI: " + userBMI);
				
			
		} else if (userChoice == 2) {
			

			System.out.print("Enter your weight in pounds: ");
			userWeight = in.nextInt();
			System.out.print("Enter your height in inches: ");
			userHeight = in.nextInt();
			
			userBMI = ((userWeight * 703) / (userHeight * userHeight));
			
			System.out.println("-----------------");
			System.out.println("Your BMI: " + userBMI);
			
		}
		
		System.out.println("-----------------");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5-24.9");
		System.out.println("Overwewight = 25-29.9");
		System.out.println("Obesity = 30+");
		
	}

}

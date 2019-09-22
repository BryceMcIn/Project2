import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner in = new Scanner(System.in);
		String userInput, e, f, g, h, concat;
		int userInputInt, a, b, c, d;
		
		System.out.println("Please enter a 4 digit number to decrypt: ");
		
		userInput = in.nextLine();
		in.close();
		
		userInputInt = Integer.parseInt(userInput);
		
		a = (userInputInt / 1000) % 10;
		b = (userInputInt / 100) % 10;
		c = (userInputInt / 10) % 10;
		d = userInputInt % 10;
		
		e = Integer.toString((a + 3) % 10);
		f = Integer.toString((b + 3) % 10);
		g = Integer.toString((c + 3) % 10);
		h = Integer.toString((d + 3) % 10);
		
		concat = g + h + e + f;
		
		System.out.println("Output: " + concat);
		
		
	}

}

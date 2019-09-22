import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declarations
		Scanner in = new Scanner(System.in);
		int userInt, a, b, c, d;
		String e, f, g, h, concat;
		
		System.out.println("Please input a 4 digit integer to encrypt: ");
		
		userInt = in.nextInt();
		in.close();
		
		a = (userInt / 1000) % 10;
		b = (userInt / 100) % 10;
		c = (userInt / 10) % 10;
		d = userInt % 10;
		
		e = Integer.toString((a + 7) % 10);
		f = Integer.toString((b + 7) % 10);
		g = Integer.toString((c + 7) % 10);
		h = Integer.toString((d + 7) % 10);
		
		concat = g + h + e + f;
		
		
		System.out.println("Output: " + concat);	
		
	
	}

}

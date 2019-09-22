import java.util.Scanner;

public class RatingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int topicTotals[] = {0,0,0,0,0};
		
		String topics[] = {"Abortion","Global Warming","Weed legalization","Bahamas","Steak and Shake 4 for 4"};
		int ratings[][] = new int [5][10];
		int counter = 0;
		int temp = 0, highest = 0, lowest = 0;
		
		while(counter < 10) {
			System.out.println("Please rate the follwing topics 1-10");
			for(int i=0; i<5;i++) {
				System.out.print(topics[i] + ":");
				ratings[i][counter] = in.nextInt();				
			}
			counter++;
		}
		
		for(int i = 0; i < 5; i++) {
			for(int f = 0; f < 10; f++) {
				topicTotals[i] = topicTotals[i] + ratings[i][f];
			}
		}
		
		for(int i = 0; i < 5; i++) {
			if(topicTotals[i] > temp) {
				temp = topicTotals[i];
				highest = i;
			}
		}
		
		for(int i = 0; i < 5; i++) {
			if(topicTotals[i] < temp) {
				temp = topicTotals[i];
				lowest = i;
			}
		}
		
		System.out.println("----------");
		for(int i = 0; i < 5; i++) {
			System.out.print(topics[i] + ": ");
			for(int f = 0; f<10; f++) {
				System.out.print(ratings[i][f] + " ");
			}
			System.out.print("[Topic Average: " + (topicTotals[i] / 10) + "]");
			System.out.println("\n");
		}
		
		System.out.println("----------");
		System.out.println("Most important topic: " + topics[highest]);
		System.out.println("Least important topic: " + topics[lowest]);
		
		
	}

}

package gradebook2;

import java.util.Scanner;
public class Grades {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] scores = new int[100];
int count = 0;
int choice = 0;

		//Menue loop
	while (choice == 5) {
		System.out.println("\n--- Gradebook Menu ---:");
		System.out.println("1. Add Score");
		System.out.println("2. View Statisitc");
		System.out.println("3. LG Breakdown");
		System.out.println("4. Reset Data");
		System.out.println("5. Quit");
		System.out.print("Selection: ");
		
		choice = sc.nextInt();
	
		
		//Switch case for menu options
		switch(choice) {
		
		case 1: 
			System.out.print("Enter score (0-100): ");
			int inputScore = sc.nextInt ();
			
			while (inputScore < 0 || inputScore > 100) {
				System.out.print("Invalid score. Please enter a number between 0 and 100: ");
				inputScore = sc.nextInt();
			}
			
			scores[count] = inputScore;
			count++;
			System.out.println("Score added.");
			break;

		case 2:
			if(count == 0) {
				System.out.println("No data avalible.");
			} else { 
				int sum = 0;
				int min = scores[0];
				int max = scores[0];
				for (int i = 0; i < count; i++) {
					sum += scores[i];
					if (scores[i] < min) min = scores[i];
					if (scores[i] > max) max = scores[i];
				}
			double average = (double) sum / count;
			

			System.out.println("Average:" + average);
			System.out.println("Minimum:" + min);
			System.out.println("Maximum:" + max);
			break;
		}
		case 3:
			int a = 0; int b = 0; int c = 0; int d = 0; int f = 0;
			 for (int i = 0; i < count; i++) {
				 if(scores[i] >= 90 && scores[i] <= 100) {
					 a++;
				 } else if(scores[i] >= 80 && scores[i] < 90) {	
					b++;
				 } else if(scores[i] >= 70 && scores[i] < 80) {
					 c++;
				 } else if(scores[i] >= 60 && scores[i] < 70) {
					 d++;
				 } else if(scores[i] >= 0 && scores[i] < 60) {
					 f++;
				 }
			 }
			 System.out.println("LG Breakdown:");
			 System.out.println("A: " + a);
			 System.out.println("B: " + b);
			 System.out.println("C: " + c);
			 System.out.println("D: " + d);
			 System.out.println("F: " + f);
			break;

		case 4:
			count = 0;
			System.out.println("Data Reset.");
			break;
		
		case 5:
			System.out.println("Bye!");
			break;
			
		default:
			System.out.print("Invalid");
		}
	}

//Close scanner
	sc.close();
	}
}
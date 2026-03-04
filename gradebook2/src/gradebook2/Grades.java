package gradebook2;

import java.util.Scanner;
import javax.security.auth.callback.ChoiceCallback;

public class Grades {

public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
int[] scores = new int[100];
int count = 0;

		
		//Menue 
	while (true) {
		System.out.println("1. Add Score");
		System.out.println("2. View Statisitc");
		System.out.println("3. LG Breakdown");
		System.out.println("4. Reset Data");
		System.out.println("5. Quit");
		
		System.out.print("6. CHOICE?:");
	
		int choice = sc.nextInt(); 

		
		//Switch case for menu options
		switch(choice) {
		
		case 1: 
			System.out.print("Add score selected pick 0-100");
			
			
			if(sc.hasNextInt()){
				int score = sc.nextInt();	
				if(score >= 0 && score <= 100) {
					scores[score]++;
					System.out.println("Score added: " + score);
				} else {
					System.out.println("Invalid score. Please enter a number between 0 and 100.");
				}
			}
			break;

		case 2:
			System.out.print("View Statitic selected ");

			break;
		case 3:
		System.out.print(" LG Breakdown selected");
		break;
		case 4:
			System.out.print("Reset Data selected");
		
		case 5:
			System.out.print("Bye!");
			break;
			
		default:
			System.out.print("CHOICE?:");

		}

//Score Grade Breakdown

	for (int i = 0; i < scores.length; i++) {
		if (scores [i] >= 90 && scores [i] <= 100) {
			System.out.println("A");

		}else if(scores[i] >= 80 && scores[i] <= 90) {
			System.out.println("B");

		}else if (scores[i] >= 70 && scores	[i] <= 80 ) {
			System.out.println("C"); 

		}else if(scores[i] >= 60 && scores[i] <= 70) {
			System.out.println("D");

		}else if(scores[i] >= 0 && scores[i] <= 50 ) {
			System.out.println("F");
		}
		// Statitics
		
		int [] array = {50,60,70,80,90,100};
		(int i = 0; i < scores.length; i++)

			 switch (min,max,avg) {
				case 1: 
				if(int min = average.Legth >= 60 && average.length <= 70 )
					system.out.print("Minimum" + int min);
				int = 0;
					break;
				case 2:
				if(average.length >= 80 && average.length <=100)
					System.out.print("Maximum" + int max);
				int max = 0;
					break;
				case 3:  {
					int  totalScores = 0;
					int totalCount = 0;
				double average = (double) totalScores / totalCount;
				System.out.print("Average" + average);



			

		}
	}
}

		
			
	


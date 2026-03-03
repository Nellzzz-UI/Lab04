package gradebook2;

public class Grades{

public static void main(String[] args) {
	
Scanner sc = new Scanner(Ststem.in);

int[] scores = new int[100];
	int count = 0;
	
	while (true) {
		System.out.println("1. Add Score");
		System.out.println("2. View Statisitc");
		System.out.println("3. LG Breakdown");
		System.out.println("4. Reset Data");
		System.out.println("5. Quit");
		
		System.out.print("6. CHOICE?:");
		
		int choice = sc.nextint(); 
		
	if (choice == 5)
		
		break;	
		

	}

	switch(choice) {
	
	case 1: 
		System.out.print("Add score selected pick 0-100");
		
		
		if( sc.hasNextInt()){
			
		}
		int score = sc.nextInt();
				
		if (score >= 0 && <= 100) {
			
		}
		
		score[count] = score;
		count++;
		System.out.print("AddedScore!");
		
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

}

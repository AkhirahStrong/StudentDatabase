import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {
		
		String [] name = {"Jack", "Jill", "James", "Kent", "Kelly", "Kim", "Lerry", "Lilly", "Laem", "Marry"};
		String [] hometown = {"Detroit", "Atlanta", "New York", "Dallas", "Lansing", "Orlando", "Ann Arbor", "Southfield", "Stone Mountain", "Clarkston"};
		String [] favoriteFood = {"Fries", "Burgers", "Mac and Cheese", "Pizza", "Subs", "Egg Rolls", "Tacos", "Corn", "Rice", "Chips"};
		String [] favoriteSong = {"Bad Habit - Ed Sheeran", "Stay Together - Al Green", "Drake & 21 Savage - Privileged Rappers", 
				                  "Without Me - Halsey", "Hello - Adele", "Work - Rihanna", "I Look To You - Whitney Houston", "Change Me - Tamela Mann",
				                  "Kiss Me More - Doja Cat","Save Your Tears - The Weekend" };
		Scanner scan = new Scanner(System.in);
		String studentInfo = "";
		boolean valid = true;
		String countinueSearch = "";
		int studentNum = 0;
		int addNumToName = 0;
		
		System.out.println("Welcome to our Java class. Choose a student you want to know about. \n");
		System.out.println("Student Names: ");
		
		
		for(String sName : name) {
			System.out.println(addNumToName++ +1 + "." + sName);
		}
		
		System.out.println("");
		
		do {
		System.out.println("Which student would you like to learn more about? (enter a number 1-10): ");
		studentNum = scan.nextInt();
		scan.nextLine();
		
		while(studentNum == 0 || studentNum >= 11) {
			try {
				System.out.printf("Student %d is %s %s", studentNum, name[studentNum - 1]);
			}catch(IndexOutOfBoundsException ex) {
				System.out.println("That student does not exist.  Please try again. (enter a number 1-10): ");
				studentNum = scan.nextInt();
			}
			
		}
		
		System.out.println("What would you like to know about " +  name[studentNum - 1] + "? Hometown, Favorite Food, or Favorute Song?");
		studentInfo = scan.nextLine();		
	    if(studentInfo.equalsIgnoreCase("Favorite Food")) {
			System.out.println(name[studentNum -1] + "'s favorite food is " + favoriteFood[studentNum -1] + "!");
		}else if(studentInfo.equalsIgnoreCase("Hometown")) {
			System.out.println(name[studentNum -1] + "'s hometown is " + hometown[studentNum -1] + "!");
		}else if(studentInfo.equalsIgnoreCase("Favorite Song")) {
			System.out.println(name[studentNum -1] + "'s favorite song is " + favoriteSong[studentNum -1] + "!");
		}else if(!(studentInfo.equalsIgnoreCase("Favorite Food") && studentInfo.equalsIgnoreCase("Home") && studentInfo.equalsIgnoreCase("Favorite Song"))) {
			System.out.println("That data does not exist.  Please try again. (enter or \"Favorite Food\" or \"hometown\" or \"Favorite Song\")");
			studentInfo = scan.nextLine();
		}
	    
		System.out.println("Would you like to continue? (Y/N)");
		countinueSearch=scan.nextLine();
		 if(countinueSearch.equalsIgnoreCase("n")){
			 System.out.println("Thank you!");
		  }
			 
	}while(countinueSearch.equalsIgnoreCase("y"));
			
	}	

}

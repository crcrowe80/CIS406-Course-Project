//Christina Crowe CIS406 Vacation Diary 1 Lab//
package vacationdiary1;
import java.util.Scanner;

public class VacationDiary1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter date vacation started: ");
		String date = input.nextLine();
		System.out.print("Enter the city visited: ");
		String city = input.nextLine();
		System.out.print("Enter the country visited: ");
		String country = input.nextLine();
		System.out.print("Enter the number of days: ");
		int days = input.nextInt();
		input.nextLine();//clear buffer
		System.out.print("Enter the mode of travel (car, airplane, ship, train, bus): ");
		String travelMode = input.nextLine();
		System.out.println("\nVacation Details:");
		System.out.println("Date Started: " + date);
		System.out.println("City: " + city);
		System.out.println("Country: " + country);
		System.out.println("Number of Days: " + days);
		System.out.println("Mode of Travel: " + travelMode);
		
		input.close();
				
	}

}

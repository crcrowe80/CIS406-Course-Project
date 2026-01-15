//Christina Crowe CIS406 Student Registration Lab//
package studentRegistration;
import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter student's last name: ");
		String lastName = input.nextLine();
		
		System.out.print("Enter student's first name: ");
		String firstName = input.nextLine();
		
		System.out.print("Enter student's year of birth: ");
		int yearOfBirth = input.nextInt();
		
		String fullName = firstName + " " + lastName;
		String password = firstName + "*" + yearOfBirth;
		
		System.out.println("Student Registration Summary");
		System.out.println("Full Name: " + fullName);
		System.out.println("Password: " + password);
		
		input.close();
	
	}

}
//Christina Crowe CIS 406 OrderEntryPhase1//

package orderEntryPhase1;

import java.util.Scanner;

public class OrderEntryPhase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String itemNumber;
		String itemDescription;
		double itemPrice;
		int quantity;
		double taxAmount;
		double discountAmount;
		double netAmount;
		
		System.out.print("Enter item number: ");
		itemNumber = input.nextLine();
		System.out.print("Enter item description: ");
		itemDescription = input.nextLine();
		System.out.print("Enter item price: ");
		itemPrice = input.nextDouble();
		System.out.print("Enter quantity ordered: ");
		quantity = input.nextInt();
		System.out.print("Enter total tax amount: ");
		taxAmount = input.nextDouble();
		System.out.print("Enter total discount amount: ");
		discountAmount = input.nextDouble();
		System.out.print("Enter net amount: ");
		netAmount = input.nextDouble();
		
		System.out.println();
		System.out.println("Item #\tDescription\tPrice\tQty\tTax\tDiscount\tNet");
		System.out.println(
				itemNumber + "\t" +
				itemDescription + "\t" +
				itemPrice + "\t" +
				quantity + "\t" +
				taxAmount + "\t" +
				discountAmount + "\t\t" +
				netAmount
		);
		
	input.close();
		}

}

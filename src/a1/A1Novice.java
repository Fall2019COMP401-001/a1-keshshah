package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		for(int i = scan.nextInt(); i > 0; i--) { //loop for each customer
			char firstChar = scan.next().charAt(0);
			String lastName = scan.next();
			int numOfItems = scan.nextInt();
			double totalPrice = 0.00;
			for(int j = numOfItems; j > 0; j--) { //loop for each produce item
				int totalAmount = scan.nextInt();
				scan.next();//produce name
				double price = scan.nextDouble();
				totalPrice += totalAmount * price;
			}
			System.out.println(firstChar + ". " + lastName + ": " + String.format("%.2f", totalPrice)); //print results in this format with cost going to second decimal
		}
		
		scan.close();//close scanner
	}
}
 
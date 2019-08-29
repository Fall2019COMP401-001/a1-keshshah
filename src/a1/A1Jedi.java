package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numOfItems = scan.nextInt();
		int custCounter[] = new int[numOfItems];
		String listOfItems[] = new String[numOfItems];
		double itemPrices[] = new double[numOfItems];
		int counter[] = new int[numOfItems];
		
		for(int i = 0; i < numOfItems; i++){
			listOfItems[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
		
		int numOfCustomer = scan.nextInt();
		for(int c = numOfCustomer; c > 0; c--) {
			scan.next();
			tay scan.next();
			int numItems = scan.nextInt();
			for(int j = numItems; j > 0; j--) {
				int totalAmount = scan.nextInt();
				String item = scan.next();
				amount(custCounter, totalAmount, item, listOfItems, counter);
			}
			
		}
		
		for(int j = 0; j < numOfItems; j++) {
			if(counter[j] == 0) {
				System.out.println("No customers bought " + listOfItems[j]);
			}
			else
				System.out.println(custCounter[j] + " customers bought " + counter[j] + " " + listOfItems[j]);
		}
		scan.close();
	}
	
	public static void amount(int cCounter[], int amount, String produce, String list[], int total[]) { 
		for(int i = 0; i < list.length; i++) {
			if(produce.equals(list[i])) {
				total[i] += amount;
				cCounter[i]++;
			}
		}
	}
}
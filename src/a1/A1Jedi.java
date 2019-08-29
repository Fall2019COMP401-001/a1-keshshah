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
		boolean sameCust = false;
		for(int c = numOfCustomer; c > 0; c--) {
			scan.next();
			scan.next();
			int numItems = scan.nextInt();
			String[] custItems = new String[numItems];
			for(int j = 0; j < numItems; j++) {
				int totalAmount = scan.nextInt();
				String item = scan.next();
				
				if(j == 0) {
					custItems[j] = item;
				}
				else {
					sameCust = isUnique(item, custItems);
					custItems[j] = item;
				}
					
				
				amount(custCounter, totalAmount, item, listOfItems, counter, sameCust);
			}
			sameCust = false;
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
	
	public static void amount(int cCounter[], int amount, String produce, String list[], int total[], boolean same) { 
		for(int i = 0; i < list.length; i++) {
			if(produce.equals(list[i])) {//used list && 
				total[i] += amount;
				if(same == false) {
					cCounter[i]++;
				}
			}
		}
	}
	
	public static boolean isUnique(String produce, String list[]) {
		for(int i = 0; i < list.length; i++) {
			if(produce.equals(list[i])) {
				return true;
			}
		}
		return false;
	}
}
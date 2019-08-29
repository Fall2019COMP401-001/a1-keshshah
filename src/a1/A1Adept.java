package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {   
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numOfItems = scan.nextInt();
		String listOfItems[] = new String[numOfItems];
		double itemPrices[] = new double[numOfItems];
		
		//create arrays for produce names and prices
		for(int i = 0; i < numOfItems; i++){
			listOfItems[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
		
		//variables to hold max and min customers
		String maxFirstName = " ";
		String maxLastName = " ";
		String minFirstName = " ";
		String minLastName = " ";
		double maxPrice = 0.0;
		double minPrice = 0.0;
		double tot = 0;
		
		int numOfCustomer = scan.nextInt();
		for(int c = numOfCustomer; c > 0; c--) {
			String firstName = scan.next();
			String lastName = scan.next();
			int numItems = scan.nextInt();
			double totalPrice = 0.0;
			for(int j = numItems; j > 0; j--) {
				int totalAmount = scan.nextInt();
				String item = scan.next();
				double price = getPrice(item, listOfItems, itemPrices);
				//System.out.println(price);
				totalPrice += (totalAmount * price);
			}
			
			if(c == 0) {
				minFirstName = firstName;
				minLastName = lastName;
				minPrice = totalPrice;
			}
			
			if(totalPrice > maxPrice) {
				maxFirstName = firstName;
				maxLastName = lastName;
				maxPrice = totalPrice;
			}
			
			if(totalPrice < maxPrice) {
				minFirstName = firstName;
				minLastName = lastName;
				minPrice = totalPrice;
			}
			tot += totalPrice;
		}
		double avg = tot / numOfCustomer;
		System.out.println("Biggest: " + maxFirstName + " " + maxLastName + " (" + String.format("%.2f", maxPrice) + ")");
		System.out.println("Smallest: " + minFirstName + " " + minLastName + " (" + String.format("%.2f", minPrice) + ")");
		System.out.println("Average: " + String.format("%.2f", avg));
	    scan.close();
	}
	
	/*
	 * searches through the array of produce to see if the product is in the name
	 * if it is, the price of the product is returned
	 * if it isn't, 0.0 is returned
	 * 
	 * @param String product name, String[] array of produce, double[] array of prices
	 * @return price as a double
	 */
	public static double getPrice(String item, String list[], double prices[]){ 
		int i = 0;
		for(i = 0; i < prices.length; i++) {
			if(item.equals(list[i]))
				return prices[i];
		}
        return 0.0;
	}		
}
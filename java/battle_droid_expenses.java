package baekjoon;

import java.util.Scanner;

public class battle_droid_expenses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		String num = sc.nextLine();
		double[] price = {350.34, 230.90, 190.55, 125.30, 180.90};
		
		for(int i = 0; i < Integer.parseInt(num); i++) {
			String req = sc.nextLine();
			String[] arr = req.split(" ");
			
			for(int k = 0; k < 5; k++) {
			total += (Integer.parseInt(arr[k]) * price[k]); 
			}
			//System.out.println("$" + Math.round(total * 100) / 100.0);
			System.out.println(String.format("$" + "%.2f", total));
			total = 0;
		}
		sc.close();
	}
}

package application;

import java.util.Scanner;

import entities.Product;

public class Vetor {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		Product[] vect = new Product[n];
		
		for(int i = 0; i < n ; i++ ) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name,price);
		}
		
		System.out.println(vect[0].getName());
		
		sc.close();
		
	}
}

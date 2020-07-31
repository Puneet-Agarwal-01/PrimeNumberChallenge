package myCaptain;

import java.util.Scanner;

public class PrimeNumberChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert any number");
		int n = sc.nextInt();
		boolean check = true;
		for (int i=2 ; i<n ; i++) {
			if (n%i == 0) {
				check = false;
				break;
			}
		}
		if(check) {
			System.out.println(n + " is a prime number");
		}
		else {
			System.out.println(n + " is not a prime number");
		}
	}

}

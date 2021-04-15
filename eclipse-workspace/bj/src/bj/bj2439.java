package bj;

import java.util.Scanner;

public class bj2439 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		int max = sc.nextInt();
		for(int i=1; i<=max; i++) {
			for(int j=max-i; j>0; j--) {
				System.out.printf(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}

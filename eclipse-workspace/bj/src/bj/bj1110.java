package bj;

import java.util.Scanner;

public class bj1110 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		int a = sc.nextInt();
		int tmp = a;
		int count = 0;
		int x = 0, y = 0;
		String s;
		do {
			s = Integer.toString(tmp);	
			if(tmp < 10) {
				s = Integer.toString(tmp) + Integer.toString(tmp);	
			}	
			else {
				x = Integer.parseInt(s.substring(0, 1)); //10의 자리
				y = Integer.parseInt(s.substring(1)); //1의 자리
				y = (x+y) % 10;
				x = tmp % 10;
				s = Integer.toString(x) + Integer.toString(y);			
			}
			tmp = Integer.parseInt(s);
			count++;
		}while(tmp != a);
		System.out.println(count);
	}
}

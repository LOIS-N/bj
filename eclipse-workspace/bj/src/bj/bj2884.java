package bj;
import java.util.Scanner;

public class bj2884 {
	static Scanner sc = new Scanner(System.in);
	public static void main	(String args[]) {
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(h >= 0 && h <= 23 && m >= 0 && m <= 59) {
			if(m >= 45) {
				m-=45;
			}
			else if(h >= 1 && m < 45) {
				h-=1;
				m = 60 - 45 + m;
			}
			else if(h == 0 && m < 45) {
				h = 23;
				m = 60 - 45 + m;
			}
			System.out.println(h + " " + m);
		}
	}
}

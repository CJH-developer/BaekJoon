package codingTeste;

import java.util.Scanner;

public class baekjoon2444 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			
			for(int j=0; j<a-i; j++) {
				System.out.print(" ");
			}
			for(int q=0; q<i*2-1; q++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i= a-1; i>=0; i--) {
			for(int j = 0; j < a-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

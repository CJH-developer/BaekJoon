package codingTeste;

import java.util.Scanner;

public class backjoon10988 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		int length = a.length();
		int result = 1;
		
		for(int i=0; i<length/2; i++) {
			if(a.charAt(i) != a.charAt(length-1-i)) {
				result = 0;
			}
		}
		System.out.println(result);
	}
}

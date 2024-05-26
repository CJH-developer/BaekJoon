package codingTeste;

import java.util.Scanner;

public class baekjoon3003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = 1;
		int q = 1;
		int l= 2;
		int b = 2;
		int n = 2;
		int p = 8;
		
		int wk = k - sc.nextInt();
		int wq = q - sc.nextInt();
		int wl = l - sc.nextInt();
		int wb = b - sc.nextInt();
		int wn = n - sc.nextInt();
		int wp = p - sc.nextInt();
		
		System.out.print(wk + " " + wq + " " + wl + " " + wb + " " + wn + " " + wp);
		
	}

}

//2439번 별 찍기-2.java
import java.util.Scanner;

public class 별_찍기_2_2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N-i;j++) {
				System.out.printf(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}

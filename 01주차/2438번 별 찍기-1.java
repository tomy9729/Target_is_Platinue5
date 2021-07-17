//2438번 별 찍기-1.java
import java.util.Scanner;

public class 별_찍기_1_2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}

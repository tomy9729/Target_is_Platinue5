//2739번 구구단.java
import java.util.Scanner;

public class 구구단_2739번 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<10;i++) {
			System.out.printf("%d * %d = %d\n",n,i,n*i);
		}
	}
}

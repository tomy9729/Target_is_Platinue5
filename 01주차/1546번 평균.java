//1546번 평균.java
import java.util.Arrays;
import java.util.Scanner;

public class 평균_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double scores[] = new double[N];
		for(int i=0;i<scores.length;i++) {
			scores[i] = sc.nextDouble();
		}
		double M = Arrays.stream(scores).max().getAsDouble();
		for(int i=0;i<scores.length;i++) {
			scores[i] = scores[i]/M*100;
		}
		System.out.println(Arrays.stream(scores).average().getAsDouble());
	}
}

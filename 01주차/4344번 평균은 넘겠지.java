//4344번 평균은 넘겠지
import java.util.Arrays;
import java.util.Scanner;

public class 평균은_넘겠지_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		for(int i=0;i<C;i++) {
			int N = sc.nextInt();
			double score[] = new double[N];
			for(int j=0;j<N;j++) {
				score[j] = sc.nextDouble();
			}
			double avg = Arrays.stream(score).average().getAsDouble();
			int count = 0;
			for(int j=0;j<N;j++) {
				if(score[j]>avg)count++;
			}
			System.out.println(String.format("%.3f", ((double)count/(double)N*100))+"%");
		}
	}
}

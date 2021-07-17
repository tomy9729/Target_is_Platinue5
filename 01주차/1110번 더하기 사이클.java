//1110번 더하기 사이클.java
import java.util.Scanner;

public class 더하기_사이클_1110 {
	public static int one_cycle(int num) {
		int num1 = num%10;
		int num2;
		if(num < 10) {
			num2 = num;
		}
		else {
			int temp = (num-num1)/10;
			temp = temp+num1;
			num2 = temp%10;
		}
		
		return num1*10+num2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cycle = one_cycle(N);
		int count=1;
		while(N != cycle) {
			cycle = one_cycle(cycle);
			count ++;
		}
		System.out.println(count);
	}
}

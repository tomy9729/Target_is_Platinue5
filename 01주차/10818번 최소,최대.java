//10818번 최소,최대.java
import java.util.Arrays;
import java.util.Scanner;

public class 최소_최대_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]nums = new int[N];
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		System.out.printf("%d %d",Arrays.stream(nums).min().getAsInt(),Arrays.stream(nums).max().getAsInt());
	}
}

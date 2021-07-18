//10809번 알파벳 찾기.java
import java.util.Arrays;
import java.util.Scanner;

public class 알파벳_찾기_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] index = new int[alphabet.length];
		Arrays.fill(index, -1);
		for(int i=0;i<alphabet.length;i++) {
			for(int j=0;j<word.length();j++) {
				if(word.charAt(j)==alphabet[i]) {
					index[i] = j;
					break;
				}
			}
		}
		for(int i=0;i<index.length;i++)System.out.printf("%d ",index[i]);
		
		
	}
}

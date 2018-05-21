import java.io.*;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		char[] cArr = A.toCharArray();
		int length = cArr.length - 1;
		boolean isPalindrom = false;
		for (int i = 0; i < length / 2; i++) {
			if (cArr[i] == cArr[length]) {
				isPalindrom = true;
				length = length - 1;
				continue;
			} else {
				isPalindrom = false;
				break;

			}

		}
		if (isPalindrom)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

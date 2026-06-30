package algorithom.solutions;

import java.util.*;

public class CharToASCIIConversion {

	public static void main(String[] args) {

		String str = "Use this editor to write, compile and run your Java code online";
		System.out.println("String value: " + str);

		findASCIIValue(str);
	}

	public static void findASCIIValue(String str) {

		char[] cArr = str.toCharArray();

		Set<Character> cSet = new LinkedHashSet<>();
		List<Integer> cList = new ArrayList<>();
		int primeCount = 0;

		for (char ch : cArr) {
			// System.out.println("Character: ["+ch+ "], ASCII Value:
			// "+(int)ch);
			if (cSet.add(ch)) {
				int i = (int) ch;
				cList.add(i);
				// System.out.println("Character: ["+ch+"] ASCII Value: "+i);
				System.out.println("[" + i + "] is Prime Number?: " + primeCheck(i));
				if (primeCheck(i)) {
					primeCount += 1;
				}
			}
		}
		System.out.println("Length of Character Set: " + cSet.size());
		System.out.println("Unique Character Set: " + cSet);
		System.out.println("ASCII List of Character: " + cList);
		System.out.println("Total Prime number: " + primeCount);
	}

	public static boolean primeCheck(int n) {
		boolean f = true;

		if (n <= 1) {
			f = false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				f = false;
			}
		}

		return f;
	}
}

package javastring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {

	// Reverse String by StringBuilder
	public static void reverseByStringBuilder() {

		String str = "Reversing string using stringbuilder";
		System.out.println("Before reverse: " + str);

		StringBuilder str1 = new StringBuilder();
		str1.append(str);
		str1 = str1.reverse();

		System.out.println("After Reverse: " + str1.toString());
	}

	// Reverse String by toCharArray
	public static void reverseBytoCharArray() {

		String str = " ";//"Reverse string by to Char array";
		System.out.println("Before reverse: " + str);

		System.out.print("After reverse: ");
		try {
			if (str == " ") {
				System.out.println("This is as empty string.");
			} else {
				char[] aChar = str.toCharArray();
				for (int i = aChar.length - 1; i >= 0; i--) {

					System.out.print(aChar[i]);

				}
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}

	}

	// Reverse String by BufferedReader
	public static void reverseStringByBufferedReader() throws IOException {

		String str = "String reverse by buffered reader";
		System.out.println("Before reverse: " + str);

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str1 = br.readLine();

			System.out.println(str1);
		} catch (IOException e) {
			e.printStackTrace();
		}

		char[] aChar = str.toCharArray();

		System.out.print("After Reverse: ");

		for (int i = aChar.length - 1; i >= 0; i--) {
			System.out.print(aChar[i]);
		}

	}

	public static void main(String[] args) {

		System.out.println("Reverse String by StringBuilder");
		reverseByStringBuilder();

		System.out.println("\nReverse String by toCharArray");
		reverseBytoCharArray();

		System.out.println("\n\nReverse String by BufferedReader");
		try {
			reverseStringByBufferedReader();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

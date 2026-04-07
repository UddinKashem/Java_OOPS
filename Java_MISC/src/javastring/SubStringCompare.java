package javastring;

public class SubStringCompare {

	public static int strSubString(String str1, String str2) {

		int count = 0;

		String aStr[] = str1.split(",");

		for (int i = 0; i < aStr.length; i++) {
			if (aStr[i].toLowerCase().contains(str2)) {
				System.out.println(str2 + " presence in " + aStr[i] + " array index[" + i + "]");
				count = count + 1;
			}
		}

		// http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=2427135
		return count;
	}

	public static void main(String[] args) {
		String str1 = "Functional Testing, blackbox testing, whitebox testing, graybox testing, load testing, performance testing ";
		String str2 = "testing";

		int count = strSubString(str1, str2);
		System.out.println("Total occurence of word '" + str2 + "':= " + count +" times.");

	}

}

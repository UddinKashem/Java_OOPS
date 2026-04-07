package javastring;

import java.util.*;

public class TestScanner {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        String str = S.substring(start, end);
        System.out.printf("%s",str);
    }
}
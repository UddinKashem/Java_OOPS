package datastructure;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Sometimes it's better to use dynamic size arrays.
 * Java's ArrayList can provide you this feature.
 * Try to solve this problem using ArrayList.
 * You are given number of lines. In each line there are zero or more integer. 
 * You need to answer a few queries where you need to tell the number in ythyth position of xthxth line.
 * 
 *  
 */

public class ArrList {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < t; i++) {
			int x = s.nextInt();
			a.add(x);
			for (int j = 0; j < x; j++) {
				b.add(s.nextInt());
			}
		}
		int d = s.nextInt();
		ArrayList<Integer> e = new ArrayList<Integer>();
		for (int i = 0; i < d; i++) {
			e.add(s.nextInt());
			e.add(s.nextInt());
		}
		s.close();
		for (int y = 0; y < d + d; y = y + 2) {
			int pos = e.get(y + 1);
			int line = e.get(y);
			int len = a.get(line - 1);
			int sum2 = 0;
			if (line - 1 > 0) {
				for (int u = 0; u < line - 1; u++) {
					sum2 += a.get(u);
				}
			}
			if (len < pos) {
				System.out.println("ERROR!");
			} else {
				System.out.println(b.get(sum2 + (pos - 1)));
			}
		}
	}

}

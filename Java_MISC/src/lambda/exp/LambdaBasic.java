package lambda.exp;

import java.util.ArrayList;

/*
 * A lambda Expressions is a short block of code that takes in parameters and
 * returns a value. Lambdas look similar to methods, but they do not need a name, 
 * and they can be written right inside a method body.
 * --
 * parameter -> expression
 */
public class LambdaBasic {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(34);
		nums.add(21);
		nums.add(56);
		nums.add(13);
		nums.forEach((n) ->{System.out.println(n);});

	}

}

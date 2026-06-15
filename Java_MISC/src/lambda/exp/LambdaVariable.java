package lambda.exp;

import java.util.ArrayList;
import java.util.function.Consumer;

/*
 * A lambda expression can be stored in a variable. The varialbe's type
 * must be an interface with exactly one method (a functional interface). 
 * The lambda must match that method's parameters and return type.
 * 
 */
public class LambdaVariable {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(14);
		nums.add(34);
		nums.add(51);
		nums.add(78);
		Consumer<Integer> method = (n) -> {System.out.println(n);};
		nums.forEach(method);

	}

}

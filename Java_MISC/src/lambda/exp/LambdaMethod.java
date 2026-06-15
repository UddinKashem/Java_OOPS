package lambda.exp;

/*
 * We can also pass a lambda expression to a method.
 * The method's parameter must be a functional interface.
 * Calling the interface's method will then run the lambda expression:
 */
interface StringFunction{
	String run(String str);
}

public class LambdaMethod {

	public static void printFormatted(String str, StringFunction format){
		String result = format.run(str);
		System.out.println(result);
	}
	public static void main(String[] args) {
		StringFunction exclaim = (s) -> s+" World"+ "!";
		StringFunction ask = (s) -> s + ",New York"+"?";
		printFormatted("Hello", exclaim);
		printFormatted("Hello", ask);

	}

}

package lambda.exp;

//Functional interface (one abstract method).
interface Greeting{
	void sayHello();
}

public class LambdaAnoymous {

	public static void main(String[] args) {
		//Anonymous1:
		Greeting g1 = new Greeting(){
			public void sayHello(){
				System.out.println("Hello from annomous 1.");
			}
		};
		g1.sayHello();
		
		Greeting g2 = () -> System.out.println("Hello from lambda anonymous 2.");
		g2.sayHello();

	}

}

package numbers;

public class RecursiveMethodCall {
	
	static int methodOne(int i){
		return methodTwo(i *=11);
	}
	
	static int methodTwo(int i){
		return methodThree(i /=11);
	}
	
	static int methodThree(int i){
		return methodFour(i -=11);
	}
	
	static int methodFour(int i){
		return i += 11;
	}

	public static void main(String[] args) {
		
		System.out.println("methodOne:= "+methodOne(11));

		System.out.println("methodTwo:= "+methodTwo(11));

		System.out.println("methodThree:= "+methodThree(11));
		
		System.out.println("methodFour:= " +methodFour(11));
	


	}

}

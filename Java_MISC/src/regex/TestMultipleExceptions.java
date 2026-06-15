package regex;

public class TestMultipleExceptions {

	public static void main(String[] args) {
		try{
			int[] nums = {2,4,5};
			System.out.println(nums[5]);
			
			int result = 10/0;
			System.out.println(result);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array index does not exist: "+ e.getMessage());
		}catch (ArithmeticException e){
			System.out.println("Cannot divide by zero.: "+e.getStackTrace());
		}catch (Exception e){
			System.out.println("Something else went wrong.");
		}
	}

}

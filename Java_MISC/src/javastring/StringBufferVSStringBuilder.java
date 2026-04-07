package javastring;

public class StringBufferVSStringBuilder {

	public static void main(String[] args) {
		int N = 999999999;
		long t;
			
		{
			StringBuffer sb = new StringBuffer();
			t = System.currentTimeMillis();
			for(int i=N;i-->0;){
				sb.append("");
			}
			System.out.println("String Buffer Start Time: "+ t);
			System.out.print("String Buffer Response time: ");
			System.out.println(System.currentTimeMillis() - t);
		}

		{
			StringBuilder sb = new StringBuilder();
			t = System.currentTimeMillis();
			System.out.println("String Builder Start Time: "+t);
			for(int i=N;i-->0;){
				sb.append("");
			}
			System.out.print("String Builder Response time: ");
			System.out.println(System.currentTimeMillis() - t);
		}

	}

}

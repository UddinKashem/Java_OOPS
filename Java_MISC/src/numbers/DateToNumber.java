package numbers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df= new SimpleDateFormat("yyyyMMdd_HHmmss_S");
		//20160520_031756 
		/*
		 * 20190608_172352
			172352
		 */
		Date date = new Date();
		String dfp=df.format(date);
		
		System.out.println(date);
		
		System.out.println(dfp);
		
		String [] aStr = dfp.split("_");
		
		System.out.println(aStr[0]);
		
		System.out.println(Integer.parseInt(aStr[1])*1000);
		
		System.out.println(Integer.parseInt(aStr[2])*1000);
		
		System.out.println(getDateMiliSeconds());

	}
	
	public static String getDateMiliSeconds(){
		

		DateFormat df= new SimpleDateFormat("yyyyMMdd_HHmmss_S");
		//20160520_031756
		Date date = new Date();
		String dfp=df.format(date);
				
		String [] aStr = dfp.split("_");
		
		int i = Integer.parseInt(aStr[2])*1000;
		String payload_nonce  = String.valueOf(i);
		
		return payload_nonce;
	}
	

}

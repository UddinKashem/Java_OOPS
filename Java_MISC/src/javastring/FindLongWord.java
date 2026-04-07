package javastring;

public class FindLongWord {
	
	/*
	 * Find the longest word from the given string
	 * 
	 */
	
	public static String findLongWord(String str){
		
		String hgstr;
		String[] tmpstr;
		
		tmpstr=str.split(" ");
		hgstr=tmpstr[0];
		
		for(int i=0;i<tmpstr.length-1;i++){
		
			if(hgstr.length()<tmpstr[i].length()){
				hgstr=tmpstr[i];
			}
	
		}
		
		return hgstr;
		
	}

	public static void main(String[] args) {
		
		String str="A word is longest is the length of the word is the longest in the string. Knowledge is power.";
		
		String longword=findLongWord(str);
		System.out.println("Longest word is: '"+longword+"' and the length of the word is: "+longword.length());
	}

}

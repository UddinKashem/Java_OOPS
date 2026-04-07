package javastring;

public class StringReverseNToggle {

    public static String toggleChar(String str) {
        String result = "";
        
        // Iterate over the original string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check the case of the character and
            // toggle accordingly
            if (Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);
            else
                result += Character.toUpperCase(ch);
        }
        
        for(int i = result.length()-1; i>=0;i--){
        	System.out.print(result.charAt(i));
        }
             
        return result;
    }

    public static void main(String[] args) {
        String str = "GeEkSfOrGeEkS!";
        System.out.println("Original String: "+str);
        String x = toggleChar(str);
        System.out.println("Toggle String: "+x);
    }
}

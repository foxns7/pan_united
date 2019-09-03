public class CamelCase {
    
    static String inputstr;
    
    static void setInputStr(String str) { 
    	inputstr = str; 
    }
    	
    static String getInputStr() {
    	return inputstr;
    }
    
	static int countWords() {
		int cnt = 0;
    	String[] str = inputstr.split("(?=\\p{Upper})");
    	
    	for (int i = 0; i < str.length; i++) {
    		if (str[i] != null) {
    			cnt++;
    		}	
		}
    	System.out.println("Count  -> "+cnt);
    	return cnt;
	}
	
   public static void main (String[] args) {
	   CamelCase.setInputStr("ThisIsAJavaTest");
	   String inputStr = CamelCase.getInputStr();
	   System.out.println("Input  '"+inputStr+"'");
	   CamelCase.countWords();
   }
	
}

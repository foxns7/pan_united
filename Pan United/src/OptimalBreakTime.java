public class OptimalBreakTime {
	
	static int len[];
    
    static void setLength(int length[]) { 
    	len = length; 
    }
    	
    static int[] getLength() {
    	return len;
    }
    
    static int countOptimalTimeBreak() {
    	int index = 0;
    	int sumOfI = 0;
    	int sumOfN = 0;
    	for (int i = 0; i < len.length; i++ ) {
    		sumOfI = i + 1;
    		sumOfN = len[i] + 1;
    		System.out.println("i=  "+i+" "
    				+ "n= "+len[i]+" "
    						+ "(i + 1)= "+sumOfI+" "
    								+ "(n + 1)= "+sumOfN);
    		if (sumOfI == sumOfN) {
    			index =  1;
    		}
    	}
    	return index;
    }
    
    public static void main (String[] args) {
       int length[] = {1, 4, 1, 3, 1};
       OptimalBreakTime.setLength(length);
       int len[] = OptimalBreakTime.getLength();
       int optimalBreakTime =  OptimalBreakTime.countOptimalTimeBreak();
 	   System.out.println("optimalBreakTime =   "+optimalBreakTime);
 	   
 	  
    }

}

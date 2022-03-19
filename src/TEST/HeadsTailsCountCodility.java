package TEST;

public class HeadsTailsCountCodility {
	    public static int solution(int[] A) {
	       int n=A.length;
	      int s1=0,s2=0;
	      for(int i=0;i<n;i++) {
	    	 if(i%2==0) {
	    		 if(A[i]!=0) {
	    			 s1++;}
	    		 if(A[i]!=1) {
	    			 s2++;}
	    	 }else {
	    		 if(A[i]!=0) {
	    			 s2++;}
	    		 if(A[i]!=1) {
	    			 s1++;}
	    		 
	    	 }
	      }
	      if(s1>s2) {
	    	  return s2;
	      }else {
	    	  return s1;
	      }
	        
	        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {0,1,1,0};
		System.out.println(solution(A));
		
	}

}

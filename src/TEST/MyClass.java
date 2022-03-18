package TEST;

public class MyClass {
    public static void main(String args[]) {

    	int num1=100, num2=200;
        
    	
 //Alternative Prime Number
    	while(num1<num2) {
    		boolean b= false;
    	for(int i=2;i<=num1/2;i++) {
    			if(num1%i==0) {
    				b=true;
    				break;
    			}
    		}if(!b) {
    			System.out.println(num1 +" is a Prime Number");
    		}
    		num1++;
    		
    	}
    	
    	}
}

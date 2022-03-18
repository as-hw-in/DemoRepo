package TEST;

public class PrintingAmstrongNumberWithinRange {
    public static void main(String args[]) {
   amstrongNumberFinding(100, 500);
     }


public static void amstrongNumberFinding(int num1,int num2) {
	     while(num1<num2){
	         int n=num1;
	         int rev=0;
	         while(n!=0){
	             int r=n%10;
	             rev=rev+(r*r*r);
	             n=n/10;
	             }
	         if(num1==rev){
	             System.out.println(num1);
	         }
	         num1++;
	     }
	
}
}
package TEST;

public class PatternPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		      A
//		    B A
//		  C B A
//		D C B A
		int a=65;
		for(int i=0;i<4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print((char)(a+k));
			}
			System.out.println();
		}
	}

}

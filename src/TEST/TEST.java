package TEST;

import java.util.Arrays;
import java.util.Scanner;

public class TEST {
	public static void main(String[] args) throws Exception{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size:");
		int m=sc.nextInt();
		System.out.println("Smallest: "+ getSmallest(m));  
	}		
		public static int getSmallest(int n) throws Exception{  
			Scanner sc= new Scanner(System.in);
			int a[]= new int[n];   
			System.out.println("Enter the values:");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);  
			return a[0];  
			}
			


}
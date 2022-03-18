package TEST;

import java.util.Scanner;

public class SolutionClass {

	public static void main(String[] args) {
		int limit1,limit2,count=0,add=0;
		double avg = 0;
		System.out.println("Enter Limit 1:");
		Scanner sc= new Scanner(System.in);
		limit1=sc.nextInt();
		System.out.println("Enter Limit 2:");
		limit2=sc.nextInt();
		

		int[] arr = new int[10];
		System.out.println("Enter the values:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if((arr[i]>limit1)&&(arr[i]<limit2))
			{
				add=arr[i]+add;
				count++;
			}
				
		}
		avg=add/count;
		System.out.println("Average of the numbers:" + avg);
		
		

	}

}

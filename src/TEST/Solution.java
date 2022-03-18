package TEST;

import java.util.Scanner;

public class Solution
{

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Values:");
        int[] n=new int[5];
        int count1=0,count2=0;
        for(int i=0;i<n.length;i++)
        {
            n[i]=sc.nextInt();
            if(n[i]%2==0) {
            	count1++;
            }else {
            	count2++;
            }
        }
        System.out.println("Count of even numbers:"+count1);
        System.out.println("Count of odd numbers:"+count2);
    }

}

		

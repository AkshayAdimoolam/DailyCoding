package LoopsAndIterationExercises;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,temp=n;
		for(;temp>0;temp/=10)
		{
			int p=temp%10;
			int pro=1;
			if(p==0 || p==1)
				pro=1;
			else
			{
				for(int i=2;i<=p;i++)
					pro*=i;
				//System.out.println(pro);
			}
			sum+=pro;
		}
		//System.out.println(sum);
		if(sum==n)
			System.out.println(n+" is a strong number");
		else
			System.out.println(n+" is not a strong number");
	}

}

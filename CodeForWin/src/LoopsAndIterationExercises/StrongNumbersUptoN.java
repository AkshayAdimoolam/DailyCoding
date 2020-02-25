package LoopsAndIterationExercises;

import java.util.Scanner;

public class StrongNumbersUptoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=1;j<=n;j++)
		{
			int sum=0,temp=j;
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
			if(sum==j)
				System.out.println(j);
		}
	}

}

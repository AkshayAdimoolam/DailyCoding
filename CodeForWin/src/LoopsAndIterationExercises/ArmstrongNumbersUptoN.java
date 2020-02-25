package LoopsAndIterationExercises;

import java.util.Scanner;

public class ArmstrongNumbersUptoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=1;j<=n;j++)
		{
			int temp=j,count=0;
			for(;temp>0;temp/=10)
				count++;
			//System.out.println(count);
			temp=j;
			int sum=0,pro;
			for(;temp>0;temp/=10)
			{
				pro=1;
				int p=temp%10;
				for(int i=0;i<count;i++)
					pro*=p;
				sum+=pro;
			}
			//System.out.println(sum);
			if(j==sum)
				System.out.println(j);
		}
	}

}

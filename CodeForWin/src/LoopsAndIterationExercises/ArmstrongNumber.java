package LoopsAndIterationExercises;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n,count=0;
		for(;temp>0;temp/=10)
			count++;
		//System.out.println(count);
		temp=n;
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
		if(n==sum)
			System.out.println(n+" is an Armstrong Number");
		else
			System.out.println(n+" is not an Armstrong Number");
	}

}

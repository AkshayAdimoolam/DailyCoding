package LoopsAndIterationExercises;

import java.util.Scanner;

public class SumOfNPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=2;i<=n;i++)
		{
			int count=1;
			for(int j=2;j<=i/2;j++)
				if(i%j==0)
					count++;
			if(count==1)
				sum+=i;
		}
		System.out.println(sum);
	}

}

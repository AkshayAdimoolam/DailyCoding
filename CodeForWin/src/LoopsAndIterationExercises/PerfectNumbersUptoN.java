package LoopsAndIterationExercises;

import java.util.Scanner;

public class PerfectNumbersUptoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=1;j<=n;j++)
		{
			int sum=0;
			for(int i=1;i<=j/2;i++)
				if(j%i==0)
					sum+=i;
			if(sum==j)
				System.out.println(j);
		}
	}
}

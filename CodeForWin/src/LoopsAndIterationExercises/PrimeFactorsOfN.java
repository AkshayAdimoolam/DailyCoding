package LoopsAndIterationExercises;

import java.util.Scanner;

public class PrimeFactorsOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				int count=0;
				for(int j=2;j<=i/2;j++)
					if(i%j==0)
						count++;
				if(count==0)
					System.out.println(i);
			}
		}
	}

}

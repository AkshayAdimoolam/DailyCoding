package LoopsAndIterationExercises;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		if(n==0 || n==1)
			System.out.println(fact);
		else
		{
			for(int i=2;i<=n;i++)
				fact*=i;
			System.out.println(fact);
		}
	}
}

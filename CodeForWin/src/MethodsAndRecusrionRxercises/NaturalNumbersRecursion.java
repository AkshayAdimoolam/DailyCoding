package MethodsAndRecusrionRxercises;

import java.util.Scanner;

public class NaturalNumbersRecursion {
	static int i=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		naturalNumbers(n);
	}
	static void naturalNumbers(int n)
	{
		if(n==0)
			return;
		else
		{
			naturalNumbers(--n);
			System.out.println(n+1);
		}
	}
}

package MethodsAndRecusrionRxercises;

import java.util.Scanner;

public class MaxAndMinOftwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(max(a,b));
		System.out.println(min(a,b));
	}	
	static int max(int a,int b)
	{
		return a>b?a:b;
	}
	static int min(int a,int b)
	{
		return a>b?b:a;
	}
}
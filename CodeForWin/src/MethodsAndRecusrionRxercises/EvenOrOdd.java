package MethodsAndRecusrionRxercises;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean c=evenOrOdd(n);
		if(c==true)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
	static boolean evenOrOdd(int n)
	{
		if(n%2==0) return true;
		else return false;
	}
}

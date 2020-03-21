package MethodsAndRecusrionRxercises;

import java.util.Scanner;

public class CubeOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(cube(n));
	}
	static int cube(int n)
	{
		return n*n*n;
	}
}

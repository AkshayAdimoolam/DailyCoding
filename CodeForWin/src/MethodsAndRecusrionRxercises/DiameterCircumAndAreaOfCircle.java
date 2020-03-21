package MethodsAndRecusrionRxercises;

import java.util.Scanner;

public class DiameterCircumAndAreaOfCircle {
	final static double PI=3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		System.out.println(diameter(r));
		System.out.println(circumference(r));
		System.out.println(area(r));
	}
	static double diameter(double r)
	{
		return 2*r;
	}
	static double circumference(double r) 
	{
		return 2*PI*r;
	}
	static double area(double r)
	{
		return PI*r*r;
	}
}

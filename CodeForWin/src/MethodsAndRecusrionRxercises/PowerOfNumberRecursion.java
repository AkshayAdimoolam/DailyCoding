package MethodsAndRecusrionRxercises;

import java.util.Scanner;

public class PowerOfNumberRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int index=sc.nextInt();
		System.out.println(power(base,index));
	}
	static int power(int base, int index)
	{
		if(index==1)
			return base;
		else
			return base*power(base,index-1);
	}
}

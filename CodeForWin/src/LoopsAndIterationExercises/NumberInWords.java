package LoopsAndIterationExercises;

import java.util.Scanner;

public class NumberInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int reverse=0;
		for(;n>0;n/=10)
			reverse=(reverse*10)+(n%10);
		System.out.println(reverse);
		for(;reverse>0;reverse/=10)
		{
			switch(reverse%10)
			{
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			}
		}
	}

}

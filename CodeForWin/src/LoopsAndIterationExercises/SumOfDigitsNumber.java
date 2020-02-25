package LoopsAndIterationExercises;

import java.util.Scanner;

public class SumOfDigitsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(;n>0;n/=10)
			sum+=(n%10);
		System.out.println(sum);
	}

}

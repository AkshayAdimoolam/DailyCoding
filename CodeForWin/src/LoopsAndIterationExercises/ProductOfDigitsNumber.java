package LoopsAndIterationExercises;

import java.util.Scanner;

public class ProductOfDigitsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int product=1;
		for(;n>0;n/=10)
			product*=(n%10);
		System.out.println(product);
	}

}

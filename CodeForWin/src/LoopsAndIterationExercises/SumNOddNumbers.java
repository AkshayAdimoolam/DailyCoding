package LoopsAndIterationExercises;

import java.util.Scanner;

public class SumNOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,i=1;
		while(i<=n)
		{
			if(i%2==1)
				sum+=i;
			i++;
		}
		System.out.println(sum);
	}

}

package LoopsAndIterationExercises;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		for(int i=2;i<n/2;i++)
			if(n%i==0)
				count++;
		if(count==1)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
	}

}

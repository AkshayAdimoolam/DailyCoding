package LoopsAndIterationExercises;

import java.util.Scanner;

public class SumNEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int sum=0,i=1;
				while(i<=n)
				{
					if(i%2==0)
						sum+=i;
					i++;
				}
				System.out.println(sum);
	}

}

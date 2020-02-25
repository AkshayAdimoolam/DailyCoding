package LoopsAndIterationExercises;

import java.util.Scanner;

public class DigitFrequencyInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=9;i++)
		{
			int count=0;
			int temp=n;
			for(;temp>0;temp/=10)
			{
				if(temp%10==i)
					count++;
			}
			System.out.println("Frequency of "+i+" is = "+count);
		}
	}

}

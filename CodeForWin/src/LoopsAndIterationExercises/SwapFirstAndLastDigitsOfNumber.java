package LoopsAndIterationExercises;

import java.util.Scanner;

public class SwapFirstAndLastDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int last=n%10;
		int first=0;
		for(int temp=n;temp>0;temp/=10)
		{
			if(temp/10==0)
				first=temp;
		}
		n/=10;
		n=(n*10)+first;
		//n%=;
	}

}

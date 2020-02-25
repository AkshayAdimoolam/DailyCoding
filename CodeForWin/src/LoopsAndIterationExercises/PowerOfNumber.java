package LoopsAndIterationExercises;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int power=sc.nextInt();
		int result=1;
		if(power==0)
			System.out.println(result);
		else
		{
			for(int i=0;i<power;i++)
				result*=base;
			System.out.println(result);
		}
	}

}

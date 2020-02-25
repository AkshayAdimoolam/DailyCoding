package LoopsAndIterationExercises;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int max=(n1>n2?n1:n2);
		//System.out.println(max);
		for(int i=1;;i++)
		{
			int multiple=max*i;
			if(multiple%n1==0 && multiple%n2==0)
			{
				System.out.println(multiple);
				break;
			}
		}
	}

}

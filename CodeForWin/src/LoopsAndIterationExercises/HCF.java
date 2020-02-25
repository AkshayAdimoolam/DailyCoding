package LoopsAndIterationExercises;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int min=(n1<n2)?n1:n2;
		int hcf=1;
		for(int i=1;i<=min;i++)
			if(n1%i==0 && n2%i==0)
				hcf=i;
		System.out.println(hcf);
	}

}

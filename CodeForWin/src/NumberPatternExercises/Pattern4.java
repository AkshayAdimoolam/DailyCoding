package NumberPatternExercises;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			System.out.print("1");
		System.out.println();
		for(int i=0;i<(n-2);i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==(n-1))
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
			System.out.print("1");
	}

}

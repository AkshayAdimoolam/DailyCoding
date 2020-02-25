package NumberPatternExercises;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println("Pattern not possible");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==(n/2) && i==(n/2))
					System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}

}

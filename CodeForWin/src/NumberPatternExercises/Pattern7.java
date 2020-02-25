package NumberPatternExercises;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println("Pattern not possible");
		else
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i==n/2 || j==n/2)
						System.out.print("0");
					else
						System.out.print("1");
				}
				System.out.println();
			}
		}
	}

}

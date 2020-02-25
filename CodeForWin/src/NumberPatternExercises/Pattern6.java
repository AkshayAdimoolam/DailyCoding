package NumberPatternExercises;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(count%2==0)
					System.out.print("1");
				else
					System.out.print("0");
				count++;
			}
			System.out.println();
		}
	}

}

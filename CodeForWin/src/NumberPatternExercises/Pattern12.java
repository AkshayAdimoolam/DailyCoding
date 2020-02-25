package NumberPatternExercises;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=a;j<=(n+a)-1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
			a++;
		}
	}

}

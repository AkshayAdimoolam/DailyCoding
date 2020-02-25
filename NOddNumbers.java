package basic_programming;

import java.util.Scanner;

public class NOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			if(i%2==1)
				System.out.println(i);
			i++;
		}
	}

}

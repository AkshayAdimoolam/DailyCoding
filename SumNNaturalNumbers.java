package basic_programming;

import java.util.Scanner;

public class SumNNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,i=1;
		while(i<=n)
		{
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}

}

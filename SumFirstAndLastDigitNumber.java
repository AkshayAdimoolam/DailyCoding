package basic_programming;

import java.util.Scanner;

public class SumFirstAndLastDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int last=n%10;
		int first=0;
		for(;n>0;n/=10)
		{
			if(n/10==0)
				first=n;
		}
		System.out.println(first+last);
	}

}

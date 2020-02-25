package basic_programming;

import java.util.Scanner;

public class DigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(;n>0;n/=10)
			count++;
		System.out.println(count);
	}
}

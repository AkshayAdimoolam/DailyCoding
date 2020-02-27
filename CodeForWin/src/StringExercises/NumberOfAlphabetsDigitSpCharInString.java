package StringExercises;

import java.util.Scanner;

public class NumberOfAlphabetsDigitSpCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		String s=sc.nextLine();
		int alpha=0,digit=0,spChar=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
				alpha++;
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
				digit++;
			else
				spChar++;
		}
		System.out.println("Count of alphabets in "+s+" is "+alpha);
		System.out.println("Count of digits in "+s+" is "+digit);
		System.out.println("Count of special characters in "+s+" is "+spChar);
	}
}

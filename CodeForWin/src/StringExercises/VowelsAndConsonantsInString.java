package StringExercises;

import java.util.Scanner;

public class VowelsAndConsonantsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		String s=sc.nextLine();
		int vowels=0,consonants=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
			{
				if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
					vowels++;
				else
					consonants++;
			}
		}
		System.out.println("Count of vowels in "+s+" is "+vowels);
		System.out.println("Count of consonants in "+s+" is "+consonants);
		//System.out.println("Count of special characters in "+s+" is "+spChar);
	}

}

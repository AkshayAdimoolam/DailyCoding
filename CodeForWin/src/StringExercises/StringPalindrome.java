package StringExercises;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] arr=new char[s.length()];
		for(int i=s.length()-1;i>=0;i--)
			arr[(s.length()-1)-i]=s.charAt(i);
		String reverse=new String(arr);
		if(s.equals(reverse))
			System.out.println(s+" is a palindrome");
		else
			System.out.println(s+" is not a palindrome");
	}

}

package StringExercises;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] arr=new char[s.length()];
		for(int i=s.length()-1;i>=0;i--)
			arr[(s.length()-1)-i]=s.charAt(i);
		String reverse=new String(arr);
		System.out.println("Revere of "+s+" is "+reverse);
	}

}

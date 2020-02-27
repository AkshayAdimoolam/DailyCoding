package StringExercises;

import java.util.Scanner;

public class LowerCaseStringToUpperCaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] arr=s.toCharArray();
		for(int i=0;i<s.length();i++) 
		{
			if(arr[i]>='a' && arr[i]<='z')
				arr[i]=(char) (arr[i]-32);
		}
		String s1=new String(arr);
		System.out.println(s+" after converting all lowercase characters into uppercase is "+s1);
	}

}

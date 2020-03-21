package StringExercises;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int a=0,b=s.length();
		String result="";
		String temp;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)==' ')
			{
				a=i+1;
				temp=new String(s.substring(a,b));
				if(result.equals(""))
					result=temp+" ";
				else
					result+=(temp+" ");
				b=i;
			}
		}
		temp=new String(s.substring(0,b));
		//System.out.println(result);
		result+=temp;
		System.out.println("Reverse order of words of string "+s+" is "+result);
	}

}

package StringExercises;

import java.util.Scanner;

public class FirstOccurenceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c=sc.next().charAt(0);
		boolean flag=true;  
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)==c)
			{
				System.out.println("First occurence of character "+c+" is "+(i+1));
				flag=false;
				break;
			}
		if(flag)
			System.out.println("Character "+c+" does not appear in string "+s);
	}

}

package StringExercises;

import java.util.Scanner;

public class CountOccurencesOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c=sc.next().charAt(0);
		boolean flag=true;
		int a=0;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)==c)
			{
				a++;
				flag=false;
			}
		if(flag)
			System.out.println("Character "+c+" does not appear in string "+s);
		else
			System.out.println("Character "+c+" occurs "+a+" times in string "+s);
	}

}

package StringExercises;

import java.util.Scanner;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int words=1;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)==' '	|| s.charAt(i)=='\t')
				words++;
		System.out.println("Number of words in "+s+" is "+words);
	}

}

package StringExercises;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int cmp=s1.compareTo(s2);
		if(cmp==0)
			System.out.println(s1+" is equal to "+s2);
		else if(cmp>0)
			System.out.println(s1+" is greater than "+s2);
		else
			System.out.println(s1+" is lesser than "+s2);
	}

}

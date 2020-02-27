package StringExercises;
import java.lang.String;
import java.util.Scanner;

public class StringCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=new String(s1);
		s1=sc.nextLine();
		System.out.println("String s1 is: "+s1);
		System.out.println("String s2 is: "+s2);
	}

}

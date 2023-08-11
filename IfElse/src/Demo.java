import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=s1.nextInt();
		if(age>=80)
		{
			System.out.println("You are Eligible for Voting...");
		}
		else
		{
			System.out.println("You are not Eligible for Voting...");
		}
	}

}

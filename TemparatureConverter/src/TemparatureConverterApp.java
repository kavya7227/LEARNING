import java.util.Scanner;
public class TemparatureConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the temparature in Fahrenheit ");
		double c=scan.nextDouble();
		TemparatureConverter temparatureConverter=new TemparatureConverter();
		double c1=temparatureConverter.convertFahrenheitToCelsius(68.0);
		System.out.println(c1);
	}

}

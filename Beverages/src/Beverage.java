import java.util.Scanner;

public class Beverage {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);		//String equals method is Case-Sensitive
		System.out.println("Enter Coffee OR Tea");
		String type = s.next();

		if(type .equalsIgnoreCase("Tea"))
			System.out.println("GingerTea");
		if(type .equals("Coffee"))		
			System.out.println("Coffee");
		else
			System.out.println("Wrogn Input");

	}
}

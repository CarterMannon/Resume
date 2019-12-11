import java.util.Scanner;
public class makeChange{
	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);
		System.out.println("This program converts cents into change.");
        System.out.println("Please type the number of cents you want converted into change.");
        System.out.println("Your number must be between 0 and 99.");
		int cents = console.nextInt();
		while(cents > 0){
			if (cents >= 25){
				System.out.println("quarter");
				cents -= 25;
			}else if (cents >= 10){
				System.out.println("dime");
				cents -= 10;
			}else if (cents >= 5){
				System.out.println("nickel");
				cents -= 5;
			}else{
				System.out.println("penny");
				cents -= 1;
			}
		}
	}
}
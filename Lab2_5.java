import java.util.Scanner;
public class Lab2_5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("temprature(fahernhit)");
		float f = input.nextFloat();
		float c = (f-32f)*(5/9f);
		System.out.println("temprature(Celcius)"+c);
	}
}
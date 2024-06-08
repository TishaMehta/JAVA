import java.util.Scanner;
public class Avg{
	float calculate(int a, int b){
		ans=(a+b+c)/3;
		return ans;

	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enterr a");
		int a=input.nextInt();
		System.out.println("enter b");
		int b=input.nextInt();
		System.out.println("enter c");
		int c=input.nextInt();
		Avg obj1=new obj1();
		float ans=obj1.calculate(a,b);
		System.out.println("Avg="+Avg);
	} 
}

import java.util.Scanner;
public class Add2
{
	public static int sum(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	public static void main(String args[]);
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter a");
		int x=nextInt();
		System.out.println("enter b");
		int y=nextInt();
		sum=sum(x,y);
		System.out.println("add="+sum);
	}
}
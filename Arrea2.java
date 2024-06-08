import java.util.Scanner;
public class Arrea{
	public static Float circle(int r)
{
Float ans=3.14f*r*r;
return ans;
}
public static void main (String args[]){
    Scanner input=new Scanner(System.in);
	System.out.println("enter r");
	int r=input.nextInt();
	Area Object1=new Area();
	float ans=Object1.circle(r);
	System.out.println("area of circle="+ans);
}
}
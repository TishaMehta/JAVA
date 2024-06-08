import java.util.Scanner;
public class Area2{
	public static Float circle(int r)
{
Float ans=3.14f*r*r;
return ans;
}
public static void main (String args[]){
    Scanner input=new Scanner(System.in);
	System.out.println("enter r");
	int r=input.nextInt();
	Area2 Object1=new Area2();
	float ans=Object1 circleArea2(r);
	System.out.println("area of circle="+ans);
}
}
import java.util.Scanner;
public class Area{
	 float circlearea(int r)
	{
		float ans=3.14f*r*r;
		return ans;
	}
	 public static void main(String[] args) {
	 	Scanner input=new Scanner(System.in);
	 	System.out.println("enter r");
	 	int r=input.nextInt();
	 	Area obj1=new Area();
	 	float ans=obj1. circlearea(r);
	 	System.out.println(ans);
	} 
}
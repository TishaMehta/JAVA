
import java.util.Scanner;
class CircleOfArea{
	public void area(float r){
		float ans;
		ans=3.14f*(r*r);

		System.out.println("area="+ans);
	}
}
class CircleOfAreaDemo{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter r");
		float r=input.nextFloat();
		CircleOfArea sc=new CircleOfArea();
		sc.area(r);
		
	}
}

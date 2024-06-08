import java.util.Scanner;
class area
{
	double  r;
	void setdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius");
		double ans=3.14*(r*r);
		
	}
	void displaydata()
	{
		System.out.println("area="+ans);
	}
}
class lab5_1{
	public static void main(String args[]){
	area r=new area();
	r.setdata();
	
	}
}
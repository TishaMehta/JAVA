import java.util.*;
class ABC
{
	int a;
	int b;
	ABC()
	{
		a=6;
		b=9;
	}
	ABC (int x,int y)
	{
		a=x;
		b=y;
	}
	void display()
	{
		System.out.println("A:"+a);
		System.out.println("B:"+b);

	}
}
class ABC1demo
{
	public static void main(String[]args)

{
	ABC obj1=new ABC();
	obj1.display();

	ABC obj2=new ABC(6,9);
	obj2.display();

}
}

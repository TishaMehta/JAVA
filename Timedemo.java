import java.util.*;
class Time
{
	int hh;
	int mm;
	Time()
	{
		hh=1;
		mm=1;
	}
	Time(int a,int b)
	{
		hh=a;
		mm=b;
	}
	void display()
	{
		System.out.println("HH:"+hh);
		System.out.println("MM:"+mm);

		
	}
	Time add(Time z)
	{
		Time temp=new Time();
		temp.mm=mm+z.mm;
		temp.hh=hh+z.hh+(temp.mm/60);
		temp.mm=temp.mm%60;
		return temp;
		
	}

}
class Timedemo
{
	public static void main(String[]args)
	{
		Time obj1=new Time(5,30);
		obj1.display();
		Time obj2=new Time(5,60);
		obj2.display();
		Time obj3=new Time();
		obj3=obj1.add(obj2);
		obj1.display();
		obj2.display();
		obj3.display();
	}
}
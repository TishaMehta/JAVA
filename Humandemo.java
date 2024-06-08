import java.util.Scanner;
class Human{
	String name;
	int age;
	void setdata()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name:");
		name=sc.next();
		System.out.println("enter age:");
		age=sc.nextInt();

	}
	void displaydata()
	{
		System.out.println("naem:"+name);
		System.out.println("age:"+age);
	}
}
class Humandemo{
	public static void main(String[] args) {
		Human h1=new Human();
		Human h2=new Human();
		h1.setdata();
		h2.setdata();
		h1.displaydata();
		h2.displaydata();

	}
	
	
}

class Member{
	String name;
	int age;
	String phoneNumber;
	String address;
	String salary;

	public Member(String name,int age,String phoneNumber,String address,String salary){
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.salary=salary;
	}
	public void printsalary(){
		System.out.println("Salary:"+salary);

	}
}
class Employee extends Member{
	String specialization;
	public Employee(String name,int age,String phoneNumber,String address,String salary,String specialization){
		super(name,age,phoneNumber,address,salary);
		this.specialization=specialization;
	}
}
class Manager extends Member{
	String department;

	public Manager(String name,int age,String phoneNumber,String address,String salary,String department){
		super(name,age,phoneNumber,address,salary);
		this.department=department;
}}
public class Lab6_3{
	public static void main(String[] args) {
		Employee e=new Employee("tisha",18,"1234563423","jamnager","123.345",".java");
		Manager m=new Manager("krishi",15,"5675437654","rajkot","345.567","computer");
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.phoneNumber);
		System.out.println(e.address);
		System.out.println(e.salary);
		System.out.println(e.specialization);
				System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.phoneNumber);
		System.out.println(m.address);
		System.out.println(m.salary);
		System.out.println(m.department);

		}
}
	

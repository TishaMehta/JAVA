class College{
	final String c="Collegedemo";
	String name="College";
}
class EngineeringCollege extends College{
	String name="EngineeringCollege";
	void print(){
		String name="Computer EngineeringCollege";
		System.out.println("name:"+name);
		System.out.println("thisname:"+this.name);
		System.out.println("super name:"+super.name);
		System.out.println("final name:"+c);
	}
}
public class CollegeDemo{
	public static void main(String[] args) {
		EngineeringCollege c=new EngineeringCollege();
		c.print();
	}
}
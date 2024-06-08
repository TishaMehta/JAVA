interface A{
	
	int  A_con=10;
	void A_methode();
}
interface A1 extends A{
	
	int A1_con=20;
	void A1_methode();

}
interface A2 extends A{

	int A2_con=30;
	void A2_methode();
}
interface A12 extends A1,A2{
	int A12_con=8;
	void A12_methode();
}
class B implements A12{

	public void A_method(){
		System.out.println(A_con);
	}

	public void A1_method(){
		System.out.println(A1_con);
	}
	
	public void A2_method(){
		System.out.println(A2_con);
	}

	public void A12_method(){
		System.out.println(A12_con);
	}
}
public class lab7_2
{
	 public static void main(String[] args) {
	B obj=new B();
	obj.A_method();
	obj.A1_method();
	obj.A2_method();
	obj.A12_method();
		
	}
}
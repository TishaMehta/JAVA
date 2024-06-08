class A{
	public final int a=10;
}
class B extends A{
	public void methods(){
		a=20;
	}
	
}
class Lab6_7{
	public static void main(String[] args) {
		A obj=new A();
		System.out.println(obj);	
	}
}
class Countobj
{
	 static int totalcount=0;
	public Countobj(){
		this.totalcount++;
	}
	public void printotalcount(){
		System.out.println(totalcount);
	}
}
public class Lab5_6{
	public static void main(String[] args) {
		Countobj co1=new Countobj();
		Countobj co2=new Countobj();
		Countobj co3=new Countobj();
		Countobj co4=new Countobj();
		co3.printotalcount();
	}
}
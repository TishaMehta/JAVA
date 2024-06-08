public class Breakdemo{
	public static void main(String[] args) {
		for(int a=1;a<10;a++)
		{
			if(a==5)
			{
					continue;
			}
			System.out.println(a);
		}
		System.out.println("after number");
	}
}
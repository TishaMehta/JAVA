import java.util.Scanner;
class Sum{
	public static void main(String[] args) {
		int marks,per;
		int sum=0;
		int a[]=new int[5];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println("enter marks");
			a[i]=input.nextInt();
			sum=sum+a[i];

		}
		per=sum/5;
		
		System.out.println("PERCENTAGE:"+per);

	}
}
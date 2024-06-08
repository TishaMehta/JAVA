import java.util.Scanner;
public class Calces{
	 public static void main(String[] args) {
			
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("enter parameter 1=");
	 	int a= sc.nextInt();
	 	System.out.println("enter parameter 2=");
	 	int b= sc.nextInt();
	 	System.out.println("select opration");
	 	int no=sc.nextInt();
	 	int ans;
	 		switch(no){
	 	case 1:
	 	ans=a+b;
	 	System.out.println(ans);
	 	break;
	 	case 2:
	 	ans=a-b;
	 	System.out.println(ans);
	 	break;
	 	case 3:
	 	ans=a*b;
	 	System.out.println(ans);
	 	break;
	 	case 4:
	 	ans=a/b;
	 	System.out.println(ans);
	 	break;
	 default:
	 	System.out.println("not");
	 }
	}
}
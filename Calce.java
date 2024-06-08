import java.util.Scanner;
public class Calce{
	 public static void main(String[] args) {
			
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("enter parameter 1=");
	 	int a= sc.nextInt();
	 	System.out.println("enter parameter 2=");
	 	int b= sc.nextInt();
	 	System.out.println("select opration");
	 	int ''ch=sc.nextInt();
	 	int ans;
	 	if(ch==1)
	 	{
	 		ans=a+b;
	 		System.out.println("add="+ans);
	 	}
	 	else if (ch==2) {
	 		ans=a-b;
	 		System.out.println("sub="+ans);
	 	}	
	 	else if(ch==3)
	 	{
	 		ans=a*b;
	 		System.out.println("mul="+ans);
	 	}
	 	else if(ch==4)
	 	{
	 		ans=a/b;
	 		System.out.println("div="+ans);
	 	}
	}
}
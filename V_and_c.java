import java.util.Scanner;
class V_and_c{
	public static void main(String [] args){
		String input=new String();
		int i,vol=0,cont=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter line");
		input=sc.nextLine();
		for(i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			if(c!='_')
			{
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				{
					vol++;
				}
				else{
						cont++;
					}
				
			}
		}
		System.out.println("vowels="+vol);
		System.out.println("consonatnt="+cont);
	}
}
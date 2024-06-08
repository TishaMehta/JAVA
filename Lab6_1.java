import java.util.Scanner;
class Student{
	int id_no;
	int no_of_subject_registered;
	String[] subject_code=new String[10];
	int[] subject_cradit=new int[10];
	String[] grade_obtained=new String[10];
	double spi;

	public Student(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id no:");
		id_no=sc.nextInt();
		System.out.println("enter no_of_subject_registered: ");
		no_of_subject_registered=sc.nextInt();
		for(int i=0;i<no_of_subject_registered;i++){
			System.out.println("subject_code:");
			subject_code[i]=sc.next();
			System.out.println("ebter subject_cradit:");
			subject_cradit[i]=sc.nextInt();
			System.out.println("enter grade_obtained:");
			grade_obtained[i]=sc.next();
		}
	}
	void display(){
		System.out.println("id no:"+id_no);
		System.out.println("no_of_subject_registered:"+no_of_subject_registered);
		System.out.println("spi"+spi);
	} 
	public double calculatespi(){
		int totalcradit=0,sum=0;
		int[] temp=new int[no_of_subject_registered];
		for (int i=0;i<no_of_subject_registered ;i++ ) {
			totalcradit=totalcradit+subject_cradit[i];
			if(grade_obtained[i].equalsIgnoreCase("a+")){
				temp[i]=10*subject_cradit[i];
			}
			else if(grade_obtained[i].equalsIgnoreCase("a")){
				temp[i]=9*subject_cradit[i];
			}
			else if(grade_obtained[i].equalsIgnoreCase("b+")){
				temp[i]=8*subject_cradit[i];
			}
		 	else if(grade_obtained[i].equalsIgnoreCase("b")){
				temp[i]=7*subject_cradit[i];
			}
			else if(grade_obtained[i].equalsIgnoreCase("c+")){
				temp[i]=6*subject_cradit[i];
			}
			else if(grade_obtained[i].equalsIgnoreCase("c")){
				temp[i]=5*subject_cradit[i];
			}
			else if(grade_obtained[i].equalsIgnoreCase("d+")){
				temp[i]=4*subject_cradit[i];
			}
			else if(grade_obtained[i].equalsIgnoreCase("d")){
				temp[i]=3*subject_cradit[i];
			}
			else{
				temp[i]=2*subject_cradit[i];
			}
			sum=sum+temp[i];
		}
		return ((float)sum/totalcradit);
	}
}
public class Lab6_1{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.spi=s1.calculatespi();
		s1.display();
	}
}
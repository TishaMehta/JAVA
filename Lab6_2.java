class book {
	private String author_name;
	book(){

	};
	book(String author_name){
		this.author_name=author_name;
	}
		void dispalydata(){
			System.out.println("author_name:"+author_name);
		}
	
}
class book_publication extends book
{
	private String title;
	book_publication(String title){
		this.title=title;
	}
		void dispalydata(){
			System.out.println("book_title:"+title);
		}
	

}
class paper_publication extends book{
	private String title;
	paper_publication(String title){
		this.title=title;
	}
		void dispalydata(){
			System.out.println("paper_publication:"+title);
		}
	

}
class Lab6_2{
	public static void main (String args[])
	{
		book b1=new book(args[0]);
		b1.dispalydata();
		book bk1=new book_publication(args[1]);
		bk1.dispalydata();
		book bk2=new paper_publication(args[2]);
		bk2.dispalydata();
	}
}
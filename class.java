class book {
	public void show()
	{
		System.out.println("authorname");
	}
}
class book_publication extends book
{
	public void show()
	{
		System.out.println("titleA");
	}

}
class paper_publication extends book{
	public void show()
	{
		System.out.println("title b");
	}

}
class 6_2{
	public static void main (String args[])
	{
		book b=new book_publication();
		b.show();
	}
}																
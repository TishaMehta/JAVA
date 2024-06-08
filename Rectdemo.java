class Rect{
	int len;
	int wid;
	boolean isFilled;
	Rect()
	{
		len=6;
		wid=7;
		isFilled=false;
	}
}
 class  Rectdemo{
	public static void main(String[] args) {
		Rect r1=new Rect();
		System.out.println(r1.len);
	}
}
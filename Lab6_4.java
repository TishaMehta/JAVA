class Mypoint{
	double x,y;
	public Mypoint(){
		x=0;
		y=0;
	}
	public Mypoint(double x,double y){
		this.x=x;
		this.y=y;

	}
	public double distance(Mypoint mp){
		double dist=Math.sqrt(Math.pow(this.x-mp.x,2)+Math.pow(this.y-mp.y,2));
		return dist;
	}
	public double distance(double x,double y){
		double dist=Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
		return dist;
	}
}
public class Lab6_4{
	public static void main(String[] args) {
		Mypoint mp1=new Mypoint();
		Mypoint mp2=new Mypoint(1,1);
		Mypoint mp3=new Mypoint(3,2);
		System.out.println(mp3.distance(mp2));
		System.out.println(mp3.distance(1,1));
	}
}
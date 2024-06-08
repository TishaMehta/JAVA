class Mypoint{
	double x,y,z;
	public Mypoint(){
		x=0;
		y=0;
		z=0;
	}
	public Mypoint(double x,double y,double z){
		this.x=x;
		this.y=y;
		this.z=z;

	}
	public double distance(Mypoint mp){
		double dist=Math.sqrt(Math.pow(this.x-mp.x,2)+Math.pow(this.y-mp.y,2)+Math.pow(this.z-mp.z,2));
		return dist;
	}
	public double distance(double x,double y,double z){
		double dist=Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2)+Math.pow(this.z-z,2));
		return dist;
	}
	
}
public class Lab6_5{
	public static void main(String[] args) {
		Mypoint mp1=new Mypoint(1,2,3);
		Mypoint mp2=new Mypoint(10,30,25.5);
		System.out.println(mp1.distance(mp2));
	}
}
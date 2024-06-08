interface Transport{
	void deliver();
}
abstract class Animals{
	abstract void display();

}
class Tigere extends Animals{
	void display(){
		System.out.println("tiger");
	}

}
class Camel extends Animals implements Transport{
	void deliver(){
		System.out.println("camel deliver");
	}
	void display(){
		System.out.println("camel");
	}
}
class Deer extends Animals{
	void display(){
		System.out.println("deer");
	}

}
class Donkey extends Animals implements Transport{
	void deliver(){
		System.out.println("donkey deliver");
	}
	void display(){
		System.out.println("donkey");
	}
}
public class lab7_3{
	public static void main(String[] args) {
		Tigere t=new Tigere();
		Deer d=new Deer();
		Donkey dm=new Donkey();
		Camel c=new Camel();
		t.display();
		d.display();
		dm.display();
		c.display();
		c.deliver();
		dm.deliver();
	}
}
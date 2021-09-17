package abtractAndInheritance;

public abstract class AbstarctClassExm {

	public abstract void color();
	public abstract void fuel();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstarctClassExm obj = new AbstarctClassExm(); 
		// cannot create obj as its a abstract class
		
		Audi audi = new Audi();
		audi.color();
		audi.fuel();
		
		BMW bmw = new BMW();
		bmw.color();
		bmw.fuel();

	}

}

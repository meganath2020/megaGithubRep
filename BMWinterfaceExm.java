package abtractAndInheritance;

public class BMWinterfaceExm implements InterfaceCar,Interfacegadgets {

//methods of InterfaceCAr
	@Override
	public void fuel() {
		
		System.out.println("fuel is petrol for BMW ");
	}

	@Override
	public void color() {

		System.out.println("Color is purple for BMW");
	}

	@Override
	public void type() {
		System.out.println("Type is sedan for BMW");
		
	}
	
	
	//methods of Interfacegadgets
	
	@Override
	public void stereo() {
		System.out.println("stereo is installed for BMW");
		
	}


	@Override
	public void gps() {
		System.out.println("gps is installed for BMW");
		
	}

	public static void main(String[] args) {
		
System.out.println(str1); // the str1 is fetched from interface
BMWinterfaceExm objbmw = new BMWinterfaceExm();
objbmw.color();
objbmw.fuel();
objbmw.type();
objbmw.stereo();
objbmw.gps();
	}



}


public class TestBile {

	public static void main(String[] args) {

		Bike b = new Bike();
		b.startBike();
		b.stopBike();
		MakeHonda m = new MakeHonda();//Here method overrirden
		m.startBike();
		m.tubeType();
		Bike b1=new MakeHonda();
		b1.startBike();
		b1.stopBike();
		
	}

}

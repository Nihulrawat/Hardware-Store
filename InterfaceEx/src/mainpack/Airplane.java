package mainpack;

public class Airplane  extends Vehicle implements Flyer {

	public void fly() {
		// TODO Auto-generated method stub
System.out.println(" ready to fly");
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
 System.out.println(" ready to take off");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub

	}


}

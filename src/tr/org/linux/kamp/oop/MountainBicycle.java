package tr.org.linux.kamp.oop;

public class MountainBicycle extends Bicycle{
	
	private int spin;
	
	
	public MountainBicycle(int spin){
		super();
		this.spin = spin;
	}

	public int getSpin() {
		return spin;
	}

	public void setSpin(int spin) {
		this.spin = spin;
	}
	
	public void changeSpin(int spin){
		this.spin = spin;
	}

	@Override
	public String toString() {
		return "MountainBicycle [spin=" + spin + "]" + super.getColor();
	}
	
	
}

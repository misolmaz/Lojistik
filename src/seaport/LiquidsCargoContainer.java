package seaport;

public class LiquidsCargoContainer extends Containers{
	private int capacity;

	public LiquidsCargoContainer() {
		super();
		
	}

	public LiquidsCargoContainer(Sender sender, int netWeight, int grossWeight, int capacity) {
		super(sender, netWeight, grossWeight);
		this.capacity=capacity;
		
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	

}

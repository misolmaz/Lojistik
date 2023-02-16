package seaport;

public class ToxicLiquidCargoContainer extends HeavyContainer {
	private int capacity;
	private String toxicType;
	
	public ToxicLiquidCargoContainer(Sender sender, int netWeight, int grossWeight, boolean openTop, int capacity,
			String toxicType) {
		super(sender, netWeight, grossWeight, openTop);
		this.capacity = capacity;
		this.toxicType = toxicType;
	}

	public ToxicLiquidCargoContainer() {
		super();
		
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getToxicType() {
		return toxicType;
	}

	public void setToxicType(String toxicType) {
		this.toxicType = toxicType;
	}
	
	
	
	

}

package seaport;

public class RefrigeratedContainer extends HeavyContainer{
	
	private int btuPerHour;

	public RefrigeratedContainer() {
		super();
		
	}

	public RefrigeratedContainer(Sender sender, int netWeight, int grossWeight, boolean openTop,int btuPerHour) {
		super(sender, netWeight, grossWeight, openTop);
		this.btuPerHour=btuPerHour;
	}

	public int getBtuPerHour() {
		return btuPerHour;
	}

	public void setBtuPerHour(int btuPerHour) {
		this.btuPerHour = btuPerHour;
	}
	
	

}

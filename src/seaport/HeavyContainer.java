package seaport;

public class HeavyContainer extends Containers {
	
	private boolean openTop;

	public HeavyContainer(Sender sender, int netWeight, int grossWeight, boolean openTop) {
		super(sender, netWeight, grossWeight);
		this.openTop = openTop;
	}

	public HeavyContainer() {
		super();
	}

	public boolean isOpenTop() {
		return openTop;
	}

	public void setOpenTop(boolean openTop) {
		this.openTop = openTop;
	}
	
	

}

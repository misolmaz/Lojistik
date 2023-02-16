package seaport;

public class ExplosivesCargoContainer extends Containers{
	
	int maxTemperature;

	public ExplosivesCargoContainer() {
		super();
		
	}

	public ExplosivesCargoContainer(Sender sender, int netWeight, int grossWeight, int maxTemparature) {
		super(sender, netWeight, grossWeight);
		this.maxTemperature=maxTemparature;
	}

	public int getMaxTemperature() {
		return maxTemperature;
	}

	public void setMaxTemperature(int maxTemperature) {
		this.maxTemperature = maxTemperature;
	}
	
	

}

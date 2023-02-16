package seaport;

public class ToxicPowderyCargoContainer extends HeavyContainer {
	
	private String toxicType;

	public ToxicPowderyCargoContainer() {
		super();// TODO Auto-generated constructor stub
	}

	public ToxicPowderyCargoContainer(Sender sender, int netWeight, int grossWeight, boolean openTop, String toxicType) {
		super(sender, netWeight, grossWeight, openTop);
		this.toxicType=toxicType;
	}

	public String getToxicType() {
		return toxicType;
	}

	public void setToxicType(String toxicType) {
		this.toxicType = toxicType;
	}
	
	 

}

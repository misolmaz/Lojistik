package seaport;

public class Sender {
	
	private final int id;
	private String name;
	private String surName;
	private String peselNumber;
	private String adress;
	private int warning;
	static int objectCount;
	
	public Sender(String name, String surName, String peselNumber, String adress) {
		
		this.name = name;
		this.surName = surName;
		this.peselNumber = peselNumber;
		this.adress = adress;
		objectCount++;
		this.id= objectCount;
	}

	public Sender() {
		objectCount++;
		this.id= objectCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getPeselNumber() {
		return peselNumber;
	}

	public void setPeselNumber(String peselNumber) {
		this.peselNumber = peselNumber;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getWarning() {
		return warning;
	}

	public void setWarning(int warning) {
		this.warning = warning;
	}
	
	public void addWarning() {
		this.warning++;
	}
	
	
	

}

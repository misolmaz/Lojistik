package seaport;

import java.time.LocalDate;

public class Containers {
	
	private int id;
	static int conteinerCount;
	private Sender Sender;
	private int netWeight;
	private int grossWeight;
	
	private LocalDate arrivalDate;
	private LocalDate disposalDate;
	
	public Containers(Sender sender, int netWeight, int grossWeight) {
		
		Sender = sender;
		this.netWeight = netWeight;
		this.grossWeight = grossWeight;
		conteinerCount++;
		this.id=conteinerCount;
	}
	public Containers() {
		conteinerCount++;
		this.id=conteinerCount;
		
	}
	
	
	public Sender getSender() {
		return Sender;
	}
	public void setSender(Sender sender) {
		Sender = sender;
	}
	public int getNetWeight() {
		return netWeight;
	}
	public void setNetWeight(int netWeight) {
		this.netWeight = netWeight;
	}
	public int getGrossWeight() {
		return grossWeight;
	}
	public void setGrossWeight(int grossWeight) {
		this.grossWeight = grossWeight;
	}
	
	public  int getId() {
		return this.id;
	}
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public LocalDate getDisposalDate() {
		return disposalDate;
	}
	public void setDisposalDate(LocalDate disposalDate) {
		this.disposalDate = disposalDate;
	}
	
	
	

}

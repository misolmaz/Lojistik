package seaport;

import java.time.LocalDate;
import java.util.ArrayList;
// IrresponsibleSenderWithDangerousGoods

public class Warehouse {
	
	private int maxContainer;
	
	private ArrayList<Containers> containers = new ArrayList<>();
	
	public Warehouse(int maxContainer) {
		
		this.maxContainer = maxContainer;
	
	}

	public Warehouse() {
		
	}

	public int getMaxContainer() {
		return maxContainer;
	}

	public void setMaxContainer(int maxContainer) {
		this.maxContainer = maxContainer;
	}

	public ArrayList<Containers> getContainers() {
		return containers;
	}

	public void setContainers(ArrayList<Containers> containers) {
		this.containers = containers;
	}
	
	
	public void addContainer (Containers container) {
		
		LocalDate dt = LocalDate.now();
		
		container.setArrivalDate(dt);
		this.containers.add(container);
		
	}

	public void checkDangerContainers() {
		LocalDate today = DateSimulate.thisDay;
		for (Containers c : containers) {
			
			if ( (c instanceof ExplosivesCargoContainer)) {
				if (c.getArrivalDate().plusDays(5).compareTo(today)<0) {
					
					dispose(c);
				}
			} else if (c instanceof ToxicLiquidCargoContainer) {
				
				if (c.getArrivalDate().plusDays(10).compareTo(today)<0) {
					dispose(c);
					
				}
				
			} else if (c instanceof ToxicPowderyCargoContainer) {
				
				if (c.getArrivalDate().plusDays(14).compareTo(today)<0) {
					
					dispose(c);
					
				}
			}
		}
	}
	
	public void dispose(Containers c) {
		
		c.getSender().addWarning();
		c.setDisposalDate(DateSimulate.thisDay);
		containers.remove(c);
		System.out.println("Conteiners :"+c.getId()+ " disposed ");
		throw new IrresponsibleSenderWithDangerousGoods("Stored time expired");
		
		
	}

}

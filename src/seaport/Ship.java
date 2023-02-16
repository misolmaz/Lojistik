package seaport;

import java.util.ArrayList;

public class Ship {
//	
//	• the maximum number of containers with toxic or explosive cargo that can be loaded within the ship
//	• the maximum number of heavy containers
//	• the maximum number of containers requiring connection to the electricity network
//	• the maximum number of all containers
//	• the maximum weight load

	private int id;
	static int objectCount;
	private String name;
	private String homePort;
	private int maxDangerConteiners;
	private int maxHeavyConteiners;
	private int maxElectricityConteiners;
	private int maxTotalConteiners;
	private int maxWeight;
	private String orgin;
	private String destination;
	private ArrayList<Containers> containers = new ArrayList<>();

	public Ship() {
		objectCount++;
		this.id = objectCount;
	}

	public Ship(String name, String homePort, int maxDangerConteiners, int maxHeavyConteiners,
			int maxElectricityConteiners, int maxTotalConteiners, int maxWeight, String orgin, String destination) {

		this.name = name;
		this.homePort = homePort;
		this.maxDangerConteiners = maxDangerConteiners;
		this.maxHeavyConteiners = maxHeavyConteiners;
		this.maxElectricityConteiners = maxElectricityConteiners;
		this.maxTotalConteiners = maxTotalConteiners;
		this.maxWeight = maxWeight;
		this.orgin = orgin;
		this.destination = destination;
		objectCount++;
		this.id = objectCount;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomePort() {
		return homePort;
	}

	public void setHomePort(String homePort) {
		this.homePort = homePort;
	}

	public int getMaxDangerConteiners() {
		return maxDangerConteiners;
	}

	public void setMaxDangerConteiners(int maxDangerConteiners) {
		this.maxDangerConteiners = maxDangerConteiners;
	}

	public int getMaxHeavyConteiners() {
		return maxHeavyConteiners;
	}

	public void setMaxHeavyConteiners(int maxHeavyConteiners) {
		this.maxHeavyConteiners = maxHeavyConteiners;
	}

	public int getMaxElectricityConteiners() {
		return maxElectricityConteiners;
	}

	public void setMaxElectricityConteiners(int maxElectricityConteiners) {
		this.maxElectricityConteiners = maxElectricityConteiners;
	}

	public int getMaxTotalConteiners() {
		return maxTotalConteiners;
	}

	public void setMaxTotalConteiners(int maxTotalConteiners) {
		this.maxTotalConteiners = maxTotalConteiners;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public String getOrgin() {
		return orgin;
	}

	public void setOrgin(String orgin) {
		this.orgin = orgin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public ArrayList<Containers> getContainers() {
		return containers;
	}

	public void setContainers(ArrayList<Containers> containers) {
		this.containers = containers;
	}

	public void addContainers(Containers container) {
		int dangerConteinersCount = 0;
		int heavyConteinersCount = 0;
		int electricityConteinersCount = 0;
		int totalConteiners = 0;
		int totalWeight = 0;

		for (Containers c : containers) {
			totalConteiners++;
			totalWeight += c.getGrossWeight();
			if (c instanceof RefrigeratedContainer) {
				electricityConteinersCount++;
			}
			if ((c instanceof ToxicLiquidCargoContainer) || (c instanceof ToxicPowderyCargoContainer)
					|| (c instanceof ExplosivesCargoContainer)) {
				dangerConteinersCount++;
			}
			if (c instanceof HeavyContainer)
				heavyConteinersCount++;

		}
//		System.out.println(dangerConteinersCount);
		if (dangerConteinersCount <= maxDangerConteiners && heavyConteinersCount <= maxHeavyConteiners
				&& electricityConteinersCount <= maxElectricityConteiners && totalConteiners <= maxTotalConteiners
				&& totalWeight <= maxWeight) {
			this.containers.add(container);
			System.out.println("added container " + container.getId() + " to " + this.getName());
		} else {

			System.out.println("danger" + "\t" + "heavy" + "\t" + "electric" + "\t" + "total" + "\t" + "totalWeight");

			System.out.println(dangerConteinersCount + "\t" + heavyConteinersCount + "\t" + electricityConteinersCount
					+ "\t\t" + totalConteiners + "\t" + totalWeight);
			System.out.println("ship " + this.getName() + " maximum capacity exceeded");
		}
	}

}

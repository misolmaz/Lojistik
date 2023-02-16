package seaport;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestMain {

	static ArrayList<Ship> ships = new ArrayList<>();
	static ArrayList<Containers> conteiners = new ArrayList<>();
	static Warehouse warehouse = new Warehouse(150);

	public static void transport(Ship ship) throws InterruptedException {

		int counter = 0;
		System.out.println("\nunload ship :" + ship.getName());
		for (Containers c : ship.getContainers()) {
			counter++;

			if (counter % 10 == 0) {
				System.out.println("\nSending 10 conteiners to Warehouse. it takes 30 seconds");
				Thread.sleep(30000);
			}
			if (c.getSender().getWarning() < 2) {
				warehouse.addContainer(c);
				System.out.println("transport container :" + c.getId());
			} else {
				System.out
						.println("Container " + c.getId() + " skipped because sender is marked  Irresponsible Sender");
			}

		}
	}

	public static void createShips() {
//		(String name, String homePort, int maxDangerConteiners, int maxHeavyConteiners,
//				int maxElectricityConteiners, int maxTotalConteiners, int maxWeight, String orgin, String destination)
		Sender sender1 = new Sender();
		sender1.setName("Jhon");
		sender1.setSurName("Doe");
		sender1.setAdress("111 st nr 5 Konak izmir Turkey");
		sender1.setPeselNumber("12345678901");
		Sender sender2 = new Sender();
		sender1.setName("Jane");
		sender1.setSurName("Doe");
		sender1.setAdress("63-1 st nr 46 Colloge Germany");
		sender1.setPeselNumber("12345678902");
		Sender sender3 = new Sender();
		sender3.setName("Jack");
		sender3.setSurName("Snow");
		sender3.setAdress("Krakowskie Przedmiescie 15/17 00-071 Warsaw Poland");
		sender3.setPeselNumber("12345678903");

		Ship s1 = new Ship("Flying Dutchman", "İzmir", 5, 8, 5, 20, 2000, "Antalya", "Sinop");
		s1.addContainers(new ToxicPowderyCargoContainer(sender1, 90, 100, false, "Chemical"));
		s1.addContainers(new ToxicPowderyCargoContainer(sender1, 75, 80, false, "Biologic"));
		s1.addContainers(new RefrigeratedContainer(sender1, 110, 130, false, 45));
		s1.addContainers(new Containers(sender2, 80, 85));
		s1.addContainers(new HeavyContainer(sender2, 150, 165, true));
		s1.addContainers(new LiquidsCargoContainer(sender2, 100, 110, 80));
		s1.addContainers(new LiquidsCargoContainer(sender3, 100, 110, 80));
		s1.addContainers(new Containers(sender2, 100, 105));
		s1.addContainers(new Containers(sender2, 80, 85));
		s1.addContainers(new Containers(sender2, 79, 85));
		s1.addContainers(new Containers(sender2, 75, 85));
		s1.addContainers(new Containers(sender1, 80, 85));
		s1.addContainers(new Containers(sender1, 85, 90));

		ships.add(s1);

		Ship s2 = new Ship("Hurricane", "Hamburg", 8, 10, 7, 25, 2000, "Hamburg", "İzmir");
		s2.addContainers(new ToxicPowderyCargoContainer(sender1, 90, 100, false, "Chemical"));
		s2.addContainers(new ToxicLiquidCargoContainer(sender1, 75, 80, false, 70, "Chemical"));
		s2.addContainers(new RefrigeratedContainer(sender1, 110, 130, false, 45));
		s2.addContainers(new Containers(sender2, 80, 85));
		s2.addContainers(new HeavyContainer(sender3, 150, 165, true));
		s2.addContainers(new LiquidsCargoContainer(sender1, 100, 110, 80));
		s2.addContainers(new ExplosivesCargoContainer(sender1, 100, 120, 45));
		s2.addContainers(new LiquidsCargoContainer(sender2, 100, 110, 80));
		s2.addContainers(new Containers(sender2, 80, 85));
		s2.addContainers(new Containers(sender1, 80, 85));
		s2.addContainers(new Containers(sender1, 80, 85));
		s2.addContainers(new Containers(sender3, 80, 85));
		s2.addContainers(new Containers(sender3, 80, 85));

		ships.add(s2);

		Ship s3 = new Ship("Dolphin", "İstanbul", 5, 8, 3, 16, 1800, "Samsun", "Hamburg");
		s3.addContainers(new ToxicPowderyCargoContainer(sender1, 90, 100, false, "Biologic"));
		s3.addContainers(new ToxicLiquidCargoContainer(sender1, 75, 80, false, 70, "Chemical"));
		s3.addContainers(new RefrigeratedContainer(sender1, 110, 130, false, 45));
		s3.addContainers(new Containers(sender2, 80, 85));
		s3.addContainers(new HeavyContainer(sender3, 150, 165, true));
		s3.addContainers(new LiquidsCargoContainer(sender2, 100, 110, 80));
		s3.addContainers(new ExplosivesCargoContainer(sender3, 100, 120, 45));
		s2.addContainers(new Containers(sender2, 80, 85));
		s2.addContainers(new Containers(sender1, 80, 85));
		s2.addContainers(new Containers(sender1, 80, 85));
		s3.addContainers(new RefrigeratedContainer(sender2, 110, 130, false, 45));
		s2.addContainers(new Containers(sender3, 80, 85));
		s2.addContainers(new Containers(sender3, 80, 85));

		ships.add(s3);

		Ship s4 = new Ship("Sezar", "Antalya", 4, 6, 4, 18, 2000, "Samsun", "Antalya");
		s4.addContainers(new ToxicPowderyCargoContainer(sender1, 90, 100, false, "Biologic"));
		s4.addContainers(new ToxicLiquidCargoContainer(sender1, 75, 80, false, 70, "Chemical"));
		s4.addContainers(new RefrigeratedContainer(sender1, 110, 130, false, 45));
		s4.addContainers(new Containers(sender2, 80, 85));
		s4.addContainers(new HeavyContainer(sender3, 150, 165, true));
		s4.addContainers(new LiquidsCargoContainer(sender2, 100, 110, 80));
		s4.addContainers(new ExplosivesCargoContainer(sender3, 100, 120, 45));
		s4.addContainers(new Containers(sender3, 100, 105));
		s4.addContainers(new Containers(sender2, 80, 85));
		s4.addContainers(new Containers(sender1, 80, 85));
		s4.addContainers(new Containers(sender1, 80, 85));
		s4.addContainers(new RefrigeratedContainer(sender2, 110, 130, false, 45));
		s4.addContainers(new Containers(sender3, 80, 85));
		s4.addContainers(new Containers(sender3, 80, 85));
		ships.add(s4);

		Ship s5 = new Ship("Ocean", "Sinop", 4, 8, 3, 20, 1800, "Samsun", "İzmir");
		s5.addContainers(new Containers(sender2, 90, 105));
		s5.addContainers(new ToxicPowderyCargoContainer(sender1, 90, 100, false, "Biologic"));
		s5.addContainers(new ToxicLiquidCargoContainer(sender1, 75, 80, false, 70, "Chemical"));
		s5.addContainers(new RefrigeratedContainer(sender1, 110, 130, false, 45));
		s5.addContainers(new Containers(sender2, 80, 85));
		s5.addContainers(new HeavyContainer(sender3, 150, 165, true));
		s5.addContainers(new LiquidsCargoContainer(sender2, 100, 110, 80));
		s5.addContainers(new ExplosivesCargoContainer(sender3, 100, 120, 45));
		s5.addContainers(new Containers(sender3, 100, 105));
		s4.addContainers(new Containers(sender2, 80, 85));
		s4.addContainers(new Containers(sender1, 80, 85));
		s4.addContainers(new Containers(sender1, 80, 85));
		s4.addContainers(new RefrigeratedContainer(sender2, 110, 130, false, 45));
		s4.addContainers(new Containers(sender3, 80, 85));
		s4.addContainers(new Containers(sender3, 80, 85));

		ships.add(s5);

	}

	public static void main(String[] args) throws InterruptedException {

		DateSimulate.thisDay = LocalDate.now();
		DateSimulate ds = new DateSimulate();

		createShips();

		transport(ships.get(0));
		transport(ships.get(1));
		transport(ships.get(2));

		ds.simulate(warehouse);

		transport(ships.get(3));
		transport(ships.get(4));

		ds.simulate(warehouse);

		System.out.println("Simulation Ended");

	}

}

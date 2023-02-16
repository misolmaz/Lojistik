package seaport;

import java.time.LocalDate;

public class DateSimulate {

	static LocalDate thisDay;
	private LocalDate toDay;

	DateSimulate() {
		this.toDay = DateSimulate.thisDay;

	}

	public LocalDate getToDay() {
		return toDay;
	}

	public void setToDay(LocalDate toDay) {
		this.toDay = toDay;
	}

	public void simulate(Warehouse warehouse) throws InterruptedException {
		int dayCount = 0;
		while (dayCount < 30) {
			Thread.sleep(5000);
			DateSimulate.thisDay = DateSimulate.thisDay.plusDays(1);
			System.out.println("\n To day is :" + DateSimulate.thisDay);
			try {
				warehouse.checkDangerContainers();
			} catch (IrresponsibleSenderWithDangerousGoods e) {
				System.out.println(e.getMessage());
			}
			dayCount++;
		}

	}

}

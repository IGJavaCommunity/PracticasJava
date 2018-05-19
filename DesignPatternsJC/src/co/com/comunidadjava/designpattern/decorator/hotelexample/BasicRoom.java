package co.com.comunidadjava.designpattern.decorator.hotelexample;

public class BasicRoom implements Room {

	@Override
	public Double getCost() {
		return 30000.00;
	}

	@Override
	public Integer getNumberOfBeds() {
		return 1;
	}

	@Override
	public boolean haveABathRoom() {

		return false;
	}

	@Override
	public boolean haveKitchen() {
		return false;
	}

}

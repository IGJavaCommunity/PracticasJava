/**
 * 
 */
package co.com.comunidadjava.designpattern.decorator.hotelexample;

/**
 * @author josevicenteayalaluna
 *
 */
public class SuiteRoom extends RoomAccommodation {

	public SuiteRoom(Room room) {
		super(room);
	}

	@Override
	public Integer getNumberOfBeds() {
		return super.getNumberOfBeds() + 2;
	}
	
	@Override
	public Double getCost() {
		return super.getCost() + 40000.00;
	}
	
	/* (non-Javadoc)
	 * @see co.com.comunidadjava.designpattern.decorator.Room#haveABathRoom()
	 */
	@Override
	public boolean haveABathRoom() {
		return true;
	}

	/* (non-Javadoc)
	 * @see co.com.comunidadjava.designpattern.decorator.Room#haveKitchen()
	 */
	@Override
	public boolean haveKitchen() {
		return true;
	}

}

/**
 * 
 */
package co.com.comunidadjava.designpattern.decorator.hotelexample;

/**
 * @author josevicenteayalaluna
 *
 */
public class PlusRoom extends RoomAccommodation {

	public PlusRoom(Room room) {
		super(room);
	}

	/* (non-Javadoc)
	 * @see co.com.comunidadjava.designpattern.decorator.Room#haveABadRoom()
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
		return false;
	}
	
	@Override
	public Double getCost() {
		return super.getCost() + 15000.00;
	}
	
	@Override
	public Integer getNumberOfBeds() {
		return super.getNumberOfBeds();
	}

}

/**
 * 
 */
package co.com.comunidadjava.designpattern.decorator.hotelexample;

/**
 * @author josevicenteayalaluna
 *
 */
public abstract class RoomAccommodation implements Room{

	protected Room room;

	public RoomAccommodation(Room room) {
		super();
		this.room = room;
	}
	
	@Override
	public Double getCost() {
		return room.getCost();
	}
	
	@Override
	public Integer getNumberOfBeds() {
		return room.getNumberOfBeds();
	}
	
	
	
}

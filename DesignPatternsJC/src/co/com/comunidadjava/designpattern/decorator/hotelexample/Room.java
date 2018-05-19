/**
 * 
 */
package co.com.comunidadjava.designpattern.decorator.hotelexample;

/**
 * @author josevicenteayalaluna
 * Interface that define the room behavior
 */
public interface Room {

	/**
	 * Return the price of the room
	 * */
	Double getCost();
	
	/**
	 * Return the number of beds in the room 
	 * */
	Integer getNumberOfBeds();
	
	/**
	 * Return if the room has a bathroom
	 * */
	boolean haveABathRoom();
	
	/**
	 * Return if there is a kitchen in the room 
	 * */
	boolean haveKitchen();
	
}

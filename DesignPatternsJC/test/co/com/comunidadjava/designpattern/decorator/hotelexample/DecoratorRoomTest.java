package co.com.comunidadjava.designpattern.decorator.hotelexample;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DecoratorRoomTest {

	private static Room room;
	
	@BeforeAll
	public static void init(){
		room = new BasicRoom();
	}
	
	@Test
	void testBasicRoom() {
		System.out.println("The price of basic room is: "+room.getCost());
		System.out.println("The number of beds in basic room is: "+room.getNumberOfBeds());
		System.out.println("---------------------");
		assertTrue(room.getNumberOfBeds()==1,"The result mus be 1 ");
	}

	@Test
	void testPlusRoom() {
		Room plusRoom = new PlusRoom(room);
		System.out.println("The price of plus room is: "+plusRoom.getCost());
		System.out.println("The number of beds in plus room is: "+plusRoom.getNumberOfBeds());
		System.out.println("---------------------");
		assertTrue(room.getNumberOfBeds()==1,"The result must be 1 ");
	}	
	
	@Test
	void testSuiteRoom() {
		Room suiteRoom = new SuiteRoom(room);
		System.out.println("The price of suite room is: "+suiteRoom.getCost());
		System.out.println("The number of beds in suite room is: "+suiteRoom.getNumberOfBeds());
		System.out.println("---------------------");
		assertTrue(suiteRoom.getNumberOfBeds()==3,"The result must be 3 ");
	}
	
}

package jasinski.sample.service;

import jasinski.sample.model.PixarCar;

import java.util.Collection;
import java.util.HashMap;

//http://en.wikipedia.org/wiki/List_of_Cars_characters
public class CarsMockService {
	
	
	private static final PixarCar e1000 = new PixarCar("1000", "Sheriff");
	private static final PixarCar e1100 = new PixarCar("1100", "Luigi");
	private static final PixarCar e1200 = new PixarCar("1200", "Guido");

	private static final PixarCar e1020 = new PixarCar("1020", "Ramone");
	private static final PixarCar e1030 = new PixarCar("1030", "Flo");
	private static final PixarCar e1040 = new PixarCar("1040", "Fillmore");

	private static final PixarCar e1120 = new PixarCar("1120", "Sarge");
	private static final PixarCar e1130 = new PixarCar("1130", "Lizzie");
	private static final PixarCar e1140 = new PixarCar("1140", "Doc");

	private static final PixarCar e1220 = new PixarCar("1220", "Sally");
	private static final PixarCar e1230 = new PixarCar("1230", "Mater");
	private static final PixarCar e1240 = new PixarCar("1240", "Lightning McQueen");

	private static final HashMap<String, PixarCar> cars = new HashMap<String, PixarCar>();

	static {	
		cars.put(e1000.getId(), e1000);
		cars.put(e1100.getId(), e1100);
		cars.put(e1200.getId(), e1200);
		cars.put(e1020.getId(), e1020);
		cars.put(e1030.getId(), e1030);
		cars.put(e1040.getId(), e1040);
		cars.put(e1120.getId(), e1120);
		cars.put(e1130.getId(), e1130);
		cars.put(e1140.getId(), e1140);
		cars.put(e1220.getId(), e1220);
		cars.put(e1230.getId(), e1230);
		cars.put(e1240.getId(), e1240);

	}

	public static PixarCar getCar(String employeeId) {
	    return cars.get(employeeId);
	}
	
	public static Collection<PixarCar> getAll() {
		return cars.values();
	}

	public static void addPixarCar(PixarCar aCar) {
		cars.put(aCar.getId(), aCar);
		
	}


}

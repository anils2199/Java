
public class Ship {
	
	String ship;
	int year;
	
	public Ship(String ship, int year) {
		this.ship = ship;
		this.year = year;
	}
	
	public String ShipName() {
		return ship;
	}
	
	public int Year() {
		return year;
	}
	
	public String toString() {
		return "Ship Name :" + ShipName() + "\nBuilt Year :" + Year();

	   }

	}

public class CargoShip extends Ship {
	int noOfTonns;
	
	public CargoShip(String name, int year, int noOfTonns) {
		
		super(name, year);
		this.noOfTonns = noOfTonns;
	}
	
	public int NoOfTonns() {
		return noOfTonns;
	}
	
	public String toString() {
		return "\n Ship name :" + ShipName() + "\nShip Capacity :" + NoOfTonns();
	}
	
	
}

public class CruiseShip extends Ship {
	
	int maxPassengers;
	
	public CruiseShip(String ship,int year, int maxPassengers) {
		
		super(ship, year);
		this.maxPassengers = maxPassengers;
	}
	
	public int MaxPassengers() {
		
		return maxPassengers;
	}
	
	public String toString() {
		
		return "\nShip Name :" + ShipName() + "\nMaximum Number of passengers :" + MaxPassengers();
	}
}
		
	public class ShipDemo {
		
		public static void main(String[] args) {
						
			Ship[] ships = new Ship[3];
			ships[0] = new Ship("Ship", 2012);
			ships[1] = new CruiseShip("CRShip", 2000, 1000);
			ships[2] = new CargoShip("CAShip", 2020, 450);
			
			for (int i = 0; i < ships.length; i++) {
							
				System.out.println(ships[i].toString());
			}
		}
	}



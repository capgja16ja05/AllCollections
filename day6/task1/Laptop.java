package day6.task1;

public class Laptop extends ElectronicDevice implements Wifi,Bluetooth {

	private String name;
	
	public Laptop(String name) {
		super();
		this.name = name;
	}

	@Override
	public void doConnection() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSwitchOn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSwitchOff() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doBluetoothConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSHareFiles() {
		// TODO Auto-generated method stub
		// code to share file based :- *.* // 
	}

	@Override
	public String toString() {
		return name;
	}

	
}

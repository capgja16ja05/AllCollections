package day6.task1;

public class Camera extends ElectronicDevice implements Bluetooth{

	String cameraName;
	
	
	public Camera(String cameraName) {
		super();
		this.cameraName = cameraName;
	}

	@Override
	public void doBluetoothConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSHareFiles() {
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
	public String toString() {
		return cameraName;
	}

	
}

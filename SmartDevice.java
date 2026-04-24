import java.util.Scanner;

interface wifi{
	void connectWifi(String networkName);
}

interface bluetooth{
	void connectBluetooth(String deviceName);
}

interface SmartFeatures extends wifi, bluetooth{
	void deviceInfo();
}

class SmartPhone implements SmartFeatures{
	private String model;
	public SmartPhone(String model) {
		this.model=model;
	}
	
	public void connectWifi(String networkName) {
		System.out.println(model+" connected to wifi "+networkName);
	}
		
	public void connectBluetooth(String deviceName) {
		System.out.println(model+" connected to bluetooth "+deviceName);
	}
	
	public void deviceInfo() {
		System.out.println("device model: "+model);

	}
}
public class SmartDevice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("model name: ");
		String model=sc.nextLine();
		SmartPhone phone=new SmartPhone(model);
		System.out.println("connect to wifi name? ");
		String wifi=sc.nextLine();
		System.out.println("connect to bluetooth? ");
		String bluetooth=sc.nextLine();
		
		phone.deviceInfo();
		phone.connectWifi(wifi);
		phone.connectBluetooth(bluetooth);
		

	}

}

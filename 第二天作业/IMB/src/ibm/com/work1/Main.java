package ibm.com.work1;

public class Main {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setSize(12.45);
		vehicle.setSpeed(20.23);
		System.out.println("体积为："+vehicle.getSize()+"\n"+"速度为："+vehicle.getSpeed());
		vehicle.speedDown();
		vehicle.speedUp();
	}
}

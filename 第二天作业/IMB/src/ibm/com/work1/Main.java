package ibm.com.work1;

public class Main {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setSize(12.45);
		vehicle.setSpeed(20.23);
		System.out.println("���Ϊ��"+vehicle.getSize()+"\n"+"�ٶ�Ϊ��"+vehicle.getSpeed());
		vehicle.speedDown();
		vehicle.speedUp();
	}
}

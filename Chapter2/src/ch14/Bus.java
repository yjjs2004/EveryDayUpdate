package ch14;

public class Bus {

	int busNumber;
	int passangerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money = money;
		passangerCount++;
	}
	
	public  void showBusInfo() {
		System.out.println(busNumber + "���� �°� ���� " + passangerCount + "�� �̰�, ������ "+ money+"�� �Դϴ�.");
	}
}



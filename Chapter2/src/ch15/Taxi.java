package ch15;

public class Taxi {

	String taxiName;
	int money;
	
	public Taxi(String taxiName) {
		this.taxiName = taxiName;
	}
	
	public void take(int money) {
		this.money = money;
	}
	
	public void TaxiInfo() {
		System.out.println(taxiName + "�ý� ������" + money + "�� �Դϴ�.");
	}
	
}

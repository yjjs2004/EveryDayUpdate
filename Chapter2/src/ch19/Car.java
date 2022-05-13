package ch19;

public class Car {

	private static int serialNum = 1000;
	private int CarNum;
	
	public Car() {
		serialNum++;
		CarNum = serialNum;
	}
	
	public int getCarNum() {
		return CarNum;
	}

	public void setCarNum(int carNum) {
		CarNum = carNum;
	}

}

package ch15;

public class TaxiTest {

	public static void main(String[] args) {
		Person person1 = new Person("Edward", 20000);
		
		Taxi taxi1 = new Taxi("�� ���� ���");
		
		person1.takeTaxi(taxi1);
		
		person1.PersonInfo();
		taxi1.TaxiInfo();
	}
}

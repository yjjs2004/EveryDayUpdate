package ch08;

public class PersonTest {

	public static void main(String[] args) {

		Person person1 = new Person();
		
		person1.height = 187;
		person1.weight = 78;
		person1.gender = "³²¼º";
		person1.name = "Thomas";
		person1.age = 37;
		
		
		System.out.println(person1.PersonInfo());
	}

}

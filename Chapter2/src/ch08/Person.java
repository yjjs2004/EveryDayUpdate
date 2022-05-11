package ch08;

public class Person {

	int height;
	int weight;
	String gender;
	String name;
	int age;
	
	public String PersonInfo() {
		return "키가 " + height + "이고 몸무게가 " + weight + "인  남성이 있습니다. 이름은 " + name + " 이고 나이는 " + age + "세 입니다.";
	}
}

package ch24;

public class StudentSubjectTest {

	public static void main(String[] args) {

		Student Lee = new Student(1001, "Lee");
		Student Kim = new Student(1002, "Kim");
		
		Lee.addSubject("����", 100);
		Lee.addSubject("����", 50);
		
		Kim.addSubject("����", 70);
		Kim.addSubject("����", 85);
		Kim.addSubject("����", 100);
		
		Lee.showScoreInfo();
		System.out.println("===================");
		Kim.showScoreInfo();
	}

}

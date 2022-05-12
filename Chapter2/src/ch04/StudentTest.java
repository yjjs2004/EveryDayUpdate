package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		
		Student studentKim = new Student();
		
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();
		
		
	}
	
	/*
	 * 
    용어 정리

    객체 : 객체 지향 프로그램의 대상, 생성된 인스턴스

    클래스 : 객체를 프로그래밍 하기위해 코드로 정의해 놓은 상태

    인스턴스 : new 키워드를 사용하여 클래스를 메모리에 생성한 상태

    멤버 변수 : 클래스의 속성, 특성

    메서드 : 멤버 변수를 이용하여 클래스의 기능을 구현한 함수

    참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수

    참조 값 : 생성된 인스턴스의 메모리 주소 값
	 */
}

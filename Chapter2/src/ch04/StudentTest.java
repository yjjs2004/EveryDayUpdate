package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "���� ������";
		
		studentLee.showStudentInfo();
		
		
		Student studentKim = new Student();
		
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "��⵵ ������";
		
		studentKim.showStudentInfo();
		
		
	}
	
	/*
	 * 
    ��� ����

    ��ü : ��ü ���� ���α׷��� ���, ������ �ν��Ͻ�

    Ŭ���� : ��ü�� ���α׷��� �ϱ����� �ڵ�� ������ ���� ����

    �ν��Ͻ� : new Ű���带 ����Ͽ� Ŭ������ �޸𸮿� ������ ����

    ��� ���� : Ŭ������ �Ӽ�, Ư��

    �޼��� : ��� ������ �̿��Ͽ� Ŭ������ ����� ������ �Լ�

    ���� ���� : �޸𸮿� ������ �ν��Ͻ��� ����Ű�� ����

    ���� �� : ������ �ν��Ͻ��� �޸� �ּ� ��
	 */
}

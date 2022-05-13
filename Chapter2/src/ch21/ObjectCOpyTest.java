package ch21;

public class ObjectCOpyTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i=0; i<library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		//얕은 복사(주소값 자체가 복사됨)
		//System.arraycopy(library, 0, copyLibaray, 0, 5);
		
		library[0].setAuthor("박완서");
		library[0].setTitle("나목");
		
		
		System.out.println("===Library===");
		for(Book book : library) {
			System.out.println(book);
			book.ShowInfo();
		}
		
		System.out.println("===Copy Library===");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.ShowInfo();
		}
		
	}
}

package thurdylab;

public class library {
public static void main(String[] args) {
	LibrarybookManagementSystem L=new LibrarybookManagementSystem();
	L.setBookId1(354345L);
	L.setBookName1("java");
	L.setBookAuthor1("Thakur publication");
	System.out.println("Book Id is:"+L.getBookId1());
	System.out.println("Book Name:"+L.getBookName1());
	System.out.println("BookAuthor:"+L.getBookAuthor1());
	L.setBookId2(4785345L);
	L.setBookName2("core java");
	L.setBookAthor2("Thakur publication");
	System.out.println("Book Id is:"+L.getBookId2());
	System.out.println("Book Name:"+L.getBookName2());
	System.out.println("BookAuthor:"+L.getBookAthor2());
}
}

import java.util.Scanner;

public class Book implements IInput, IDisplay{

	private String bookID;
	private String title;
	private String publisher;
	@Override
	public void print() {
		System.out.print("BookID: "+bookID+" title: "+title+" publisher: "+publisher+"\n");	
	}
	@Override
	public void printDetails() {
		System.out.println("BookID: "+bookID);
		System.out.println("title: "+title);
		System.out.println("publisher: "+publisher);
	}
	@Override
	public void input() {
		Scanner s= new Scanner(System.in);
		System.out.print("enter bookID: ");
		this.bookID = s.nextLine();
		System.out.print("enter title: ");
		this.title = s.nextLine();
		System.out.print("enter publisher: ");
		this.publisher = s.nextLine();
	}
	
}

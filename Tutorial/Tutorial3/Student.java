import java.util.Scanner;

public class Student implements IInput, IDisplay{

	private String StudentID;
	private String name;
	
	@Override
	public void print() {
		System.out.print("Student ID:"+StudentID+"\t"+"name:"+name+"\n");
	}

	@Override
	public void printDetails() {
		System.out.println("StudentID:"+StudentID);
		System.out.println("Name:"+name);
		
	}

	@Override
	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("enter StudentID:");
		this.StudentID = s.nextLine();
		System.out.print("enter name:");
		this.name = s.nextLine();
	}
}

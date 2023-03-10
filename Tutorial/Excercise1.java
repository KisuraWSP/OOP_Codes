import java.util.Scanner; 

class Student{
	private int mark1, mark2, mark3;
	
	//constructor
	Student(){
		this.mark1 = 0;
		this.mark2 = 0;
		this.mark3 = 0;
	}
	
	//calculate average method - takes 3 marks of the student and outputs the average
	public double calculateAvg(int mark1, int mark2, int mark3) {
		double avg = (mark1+mark2+mark3)/3.0d;
		return avg;
	}
	
	//display method - outputs the object details onto the console
	public void display(String id, String name, double avg) {
		System.out.print("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Average Marks: "+avg);
	}
}
public class Excercise1 {

	public static void main(String[] args) {
		Student st =  new Student();
		
		Scanner s = new Scanner(System.in);
		int mark1, mark2, mark3;
		String name, id;
		
		//user interface - this is displayed onto the console for users to enter their data
		System.out.print("Enter id: ");
		id = s.nextLine();
		System.out.print("Enter name: ");
		name = s.nextLine();
		System.out.print("enter mark1: ");
		mark1 = s.nextInt();
		System.out.print("enter mark2: ");
		mark2 = s.nextInt();
		System.out.print("enter mark3: ");
		mark3 = s.nextInt();
		
		double avg = st.calculateAvg(mark1, mark2, mark3);
		st.display(id, name, avg);
	}
}

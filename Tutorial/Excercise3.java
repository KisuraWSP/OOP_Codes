class Student{
	private String ditno;
	private String name;
	private static String batchId;
	
	public Student(String mditno, String mname) {
		ditno = mditno;
		name = mname;
	}
	
	public void setBatchId(String mBatchId) {
		batchId = mBatchId;
	}
	
	public String getDitno() {
		return ditno;
	}

	public void setDitno(String ditno) {
		this.ditno = ditno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getBatchId() {
		return batchId;
	}

	public static void setBatchId2(String mBatchId) {
		batchId = mBatchId;
	}
}
public class Excercise3 {

	public static void main(String[] args) {
		Student s = new Student("IT21883383838","Tharindi");
		Student s2 = new Student("IT218373737373","Kumudu");
		
		s.setBatchId("Malabe - Y1B2");
		System.out.println(s.getBatchId()+"-"+s.getDitno());
		System.out.println(s2.getBatchId()+"-"+s2.getDitno());
		Student.setBatchId2("Metro - Y1B1");
		System.out.println(s.getBatchId()+"-"+s.getDitno());
		System.out.println(s2.getBatchId()+"-"+s2.getDitno());
	}

}

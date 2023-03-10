//Excercise 2
class Point3D{
	private float x,y,z;
	
	Point3D(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double calculateDistance() {
		return Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2)));
	}
}

public class PointApp {

	public static void main(String[] args) {
		Point3D coordinate1 = new Point3D(1,1,1);		
		System.out.println(coordinate1.calculateDistance());

	}

}

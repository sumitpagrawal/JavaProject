package ReturnType;

public class Radius_WithoutReturn {
	
	static void areaOfCircle(double rad) {
		double value=3.14*rad*rad;
		System.out.println("AREA OF CIRCLE IS: "+value);
	}
	
	public static void main(String[] args) {
		areaOfCircle(10);		
	}
}

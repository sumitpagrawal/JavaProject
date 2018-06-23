package ReturnType;

public class Radius_WithReturn {
	
	static double areaOfCircle(double rad) {
		double value=3.14*rad*rad;
		return value;
	}
	
	public static void main(String[] args) {
		double value = areaOfCircle(2.12);
		System.out.println("AREA OF CIRCLE IS: "+value);
	}
}

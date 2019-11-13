package five;

public class ThreeCircle {

//		원의 반지름 정보를 전달하면, 
//		원의 넓이를 계산해서 '반환'하는 메서드와 원 의 둘레를 계산해서 반환하는 메서드를 각각 정의하고, 
//		이를 호출하는 main 메서드를 정의하자.   (2*π*r), (π*r∧2) 

	public static void main(String[] args) {

		calcul(6);

	}

	public static void calcul(int r) {

		int space;
		int length;

		space = (int) (r * r);
		length = (int) (2 * r);

		System.out.println("*원");
		System.out.println("넓이 : " + space + "π");
		System.out.println("둘레 : " + length + "π");

	}
	
	
//	 public static void main(String[] args) {
//		  System.out.println(area(5));
//		  System.out.println(round(5));
//		 }
//
//		 static float area(float a) {
//		  final float PI = 3.14f;
//		  
//		  float area = 2*PI*a;
//		  
//		  return area;
//		 }
//		 
//		 static float round(float a) {
//		  final float PI = 3.14f;
//		  
//		  float round = PI*(float)Math.pow(a, 2);
//		  
//		  return round;
//		 }
}

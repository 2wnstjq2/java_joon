package test;

public class BaseballOri2 {

	int s = 0; // 스트라이크
	int b = 0; // 볼
	char x = 0;
	char y = 0;
	char z = 0;
	char temp = 0;
	
	


	public void main(String[] args) {
		char[] a_v = new char[3];
		a_v[0] = '1';
		a_v[1] = '3';
		a_v[2] = '6';
		char[] b_v = new char[3];
		b_v[0] = x;
		b_v[1] = y;
		b_v[2] = z;


	}

	void zero() {
		if (s + b == 0) {
			x = (char) (x + 3);
			y = (char) (y + 3);
			z = (char) (z + 3);
		}
	}

	void three() {
		
			if (s + b == 3) {
				while (true) {
				temp = x;
				x = y;
				y = z;
				z = temp;
				
				}
			}
		
	}
	
//	void open() {
//		for (int i = 0; i < 3; ++i) {// a_v
//			for (int k = 0; k < 3; ++k) {// b_v
//				if (a_v[i] == b_v[k]) {
//					if (i == k)
//						s++;
//					else
//						b++;
//				}
//			}
//		}
//	}

}

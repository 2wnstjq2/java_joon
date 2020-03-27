package test;

public class AAA {

	//의존상태
		//Object o = new BBB();
		//Object o = new CCC();
		
	/* 의존성을 떨어뜨리자 */
	//참조변수
		Object o;

		void setObject(Object o) {
			this.o = o;
		}
		
		AAA(Object o){
			this.o = o;
		}
			
		void print() {
			o.toString();
		}
		
	

}

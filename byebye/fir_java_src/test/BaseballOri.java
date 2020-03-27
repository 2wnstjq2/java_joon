package test;

public class BaseballOri {
	public static void main(String[] args) {
		
		//배열하나를 더 만들어서 거기에 수를 더하고 빼자

		char hun = 0;//백의자리
		char ten = 0;//십의자리
		char one = 0;//일의자리
		
		int s= 0; //스트라이크
		int b= 0; //볼
		
		char[] a_v =new char[3];
		a_v[0] = '1';
		a_v[1] = '3';
		a_v[2] = '6';
		char[] b_v =new char[3];
		b_v[0] = hun;
		b_v[1] = ten;
		b_v[2] = one;	

		if(hun<=0 && hun<10) {
			
		}
		for(int i=0;i<3;++i) {//a_v
			
		 for(int k=0;k<3;++k) {//b_v
		 if(a_v[i] == b_v[k])
		 {
		  if(i==k) s++;
		  else     b++;
		  
		 }
		 }
	
		}
		System.out.println(hun);
		
	}
}

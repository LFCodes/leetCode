package leetCode;

//x++ 是先输出值再自加，++x 是先自加再输出值。
public class test4 {
	static {
		int x = 5;
	}
	static int x ,y;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x--;
		method();
		

		System.out.println(x + y++ + x);
		System.out.println(y);
	}

	public static void method() {
		y = x++ + ++x ;
	}
}

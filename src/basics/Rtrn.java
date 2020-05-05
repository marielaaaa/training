package basics;

public class Rtrn {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		bitch(a, b);
		int result = bitch(a, b);
		System.out.println("" + result);
	}
	
	static int bitch(int numa, int numb){
		int result = numa * numb;
		return result;
		
	}
}

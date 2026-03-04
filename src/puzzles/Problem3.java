package puzzles;

public class Problem3 {
	public static void solve() {
		int a=2, b=5;
		
		System.out.println("input a:" + a + "input b:" + b);
		
		int temp = a;
		
		a = b;
		
		b = temp;
		
		System.out.println("output a:" + a + "input b:" + b);
		
	}

}

package h2;

public class H2_main {
	public static void main(String[] args) {
		boolean x;
		boolean y;
		boolean a;
		boolean b;
		boolean c;
		int input = 10;
		if(input == 10||input == 11) {
			x = true;
		}
			else {
				x = false;
			}
		if(input == 11||input == 1) {
			y = true;
		}
		else {
			y = false;
		}
		if(y == true && x == true) {
			a = true;
		}
		else {
			a = false;
		}
		if(x == true || x^y) {
			b = true;
		}
		else {
			b = false;
		}
		if((!x && !y) || (x ^ y)) {
			c = true;
		}
		else {
			c = false;
		}
		System.out.println(input);
		System.out.println("x:"+x); System.out.println("y:"+y); 
		System.out.println("a:"+a); System.out.println("b:"+b);
		System.out.println("c:"+c);
		}
	}


